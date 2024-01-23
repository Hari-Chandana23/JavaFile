
    package OOPS;
    abstract class Department {
        int size = 100;
        abstract int getDepartmentSize();
    }

    class Deptsize extends Department{
        public int getDepartmentSize()
        {
            return size;

        }
    }
    public class Branch{
        public static void main(String args[]) {
            Deptsize dept = new Deptsize();
            System.out.println(dept.getDepartmentSize());
        }
    }

