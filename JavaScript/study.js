import React from 'react';
import { render, screen } from '@testing-library/react';
import userEvent from '@testing-library/user-event';
import Select from './Select';

describe('Select', () => {
  test('should render a select element', () => {
    render(<Select />);

    const selectElement = screen.getByRole('combobox');

    expect(selectElement).toBeInTheDocument();
  });

  test('should render options', () => {
    const options = [
      { value: 'chocolate', label: 'Chocolate' },
      { value: 'strawberry', label: 'Strawberry' },
      { value: 'vanilla', label: 'Vanilla' }
    ];

    render(<Select options={options} />);

    const optionsList = screen.getAllByRole('option');

    expect(optionsList).toHaveLength(3);
    expect(optionsList[0]).toHaveTextContent('Chocolate');
    expect(optionsList[1]).toHaveTextContent('Strawberry');
    expect(optionsList[2]).toHaveTextContent('Vanilla');
  });

  test('should call the onChange function when an option is selected', () => {
    const onChange = jest.fn();
    const options = [
      { value: 'chocolate', label: 'Chocolate' },
      { value: 'strawberry', label: 'Strawberry' },
      { value: 'vanilla', label: 'Vanilla' }
    ];

    render(<Select options={options} onChange={onChange} />);

    const option = screen.getByText('Chocolate');
    userEvent.selectOptions(option);

    expect(onChange).toHaveBeenCalledTimes(1);
    expect(onChange).toHaveBeenCalledWith({ value: 'chocolate', label: 'Chocolate' });
  });
});