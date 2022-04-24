public class Student {
    String name, stuNo;
    int classes;
    Course mat;
    int mtmtkVerbalGrade;
    Course fizik;
    int fzkVerbalGrade;
    Course kimya;
    int kmyVerbalGrade;
    double avarage;
    boolean isPass;


    Student(String name, int classes, String stuNo, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.classes = classes;
        this.stuNo = stuNo;
        this.mat = mat;
        this.mtmtkVerbalGrade = mtmtkVerbalGrade;
        this.fizik = fizik;
        this.fzkVerbalGrade = fzkVerbalGrade;
        this.kimya = kimya;
        this.kmyVerbalGrade = kmyVerbalGrade;

        calcAvarage();
        this.isPass = false;
    }


    public void addBulkExamNote(int mat, int mtmtkVerbalGrade, int fizik, int fzkVerbalGrade, int kimya, int kmyVerbalGrade) {

        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;

        }
        if (mtmtkVerbalGrade >= 0 && mtmtkVerbalGrade <= 100) {
            this.mat.verbalGrade = mtmtkVerbalGrade;
        }


        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;

        }
        if (fzkVerbalGrade >= 0 && fzkVerbalGrade <= 100) {
            this.fizik.verbalGrade = fzkVerbalGrade;
        }

        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;

        }
        if (kmyVerbalGrade >= 0 && kmyVerbalGrade <= 100) {
            this.kimya.verbalGrade = kmyVerbalGrade;
        }

    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama : " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı Geçti. ");
            } else {
                System.out.println("Sınıfta Kaldı.");
            }
        }
    }

    public void calcAvarage() {
        this.avarage = (((this.fizik.note * 0.80 + this.fizik.verbalGrade * 0.20)) +
                ((this.kimya.note * 0.80 + this.kimya.verbalGrade * 0.20)) +
                ((this.mat.note * 0.80 + this.mat.verbalGrade * 0.20))) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage > 55;
    }

    public void printNote() {
        System.out.println("=========================");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik Notu : " + this.mat.note);
        System.out.println("Sözlü Notu : " + this.mat.verbalGrade);
        System.out.println("");
        System.out.println("Fizik Notu : " + this.fizik.note);
        System.out.println("Sözlü Notu : " + this.fizik.verbalGrade);
        System.out.println("");
        System.out.println("Kimya Notu : " + this.kimya.note);
        System.out.println("Sözlü Notu : " + this.kimya.verbalGrade);
        System.out.println("");


    }

}

