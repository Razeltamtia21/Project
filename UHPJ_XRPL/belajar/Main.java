public class Main {
    public static void main(String[] args) {
        StudentList studentList = new StudentList();

        // Menambahkan nama siswa
        studentList.addStudent("Alice");
        studentList.addStudent("Bob");
        studentList.addStudent("Charlie");

        // Menampilkan daftar nama siswa
        System.out.println("Sebelum penghapusan:");
        studentList.printStudents();

        // Menghapus salah satu nama siswa
        studentList.removeStudent("Bob");

        // Menampilkan daftar nama siswa setelah penghapusan
        System.out.println("\nSetelah penghapusan:");
        studentList.printStudents();
    }
}