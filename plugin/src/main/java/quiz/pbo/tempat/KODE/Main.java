package quiz.pbo.tempat.KODE;

/* ~~ Entry point that shows the interactive CLI menu in a loop ~~ */
public class Main {

    /* ~~ Starts the application and loops until the user chooses to exit ~~ */
    public static void main(String[] args) {
        MahasiswaDataView mahasiswaView = new MahasiswaDataView();
        MataKuliahDataView mataKuliahView = new MataKuliahDataView();
        RuanganDataView ruanganView = new RuanganDataView();

        while (true) {
            System.out.println("=== PILIH MENU ===");
            System.out.println("1. Mahasiswa");
            System.out.println("2. Mata Kuliah");
            System.out.println("3. Ruangan");
            System.out.println("0. Keluar");
            System.out.print("Pilihan: ");
            String choice = InputHelper.readLine();
            if (choice == null) {
                break;
            }

            if (choice.equals("0")) {
                System.out.println("Program selesai.");
                break;
            }

            if (choice.equals("1")) {
                showActionMenu(mahasiswaView);
            } else if (choice.equals("2")) {
                showActionMenu(mataKuliahView);
            } else if (choice.equals("3")) {
                showActionMenu(ruanganView);
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }
    }

    /* ~~ Shows the action sub-menu and delegates each action to the generic view ~~ */
    private static <T> void showActionMenu(DataView<T> view) {
        System.out.println("=== PILIH AKSI ===");
        System.out.println("1. Tampilkan semua data");
        System.out.println("2. Cari satu data");
        System.out.println("3. Tambah data");
        System.out.println("4. Ubah data");
        System.out.println("5. Delete data");
        System.out.print("Pilihan: ");
        String action = InputHelper.readLine();
        if (action == null) {
            return;
        }

        switch (action) {
            case "1":
                view.printAll();
                break;
            case "2":
                System.out.print("Enter primary key: ");
                String primaryKey = InputHelper.readLine();
                view.printByPk(primaryKey == null ? "" : primaryKey);
                break;
            case "3":
                view.showInsertForm();
                break;
            case "4":
                view.showUpdateForm();
                break;
            case "5":
                view.promptDelete();
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }
    }
}
