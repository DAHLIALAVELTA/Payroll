
package test;

import pajak.Pajak;

public class TestRunner {
    public static void main(String[] args){
      Pajak pajak = new Pajak();

        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.MANAGER, "01/06/2018", "31/12/2020"));//test case 1
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.SENIORENGINEER, "01/04/2020", "31/12/2020"));//test case 2
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.JUNIORENGINEER, "01/05/2021", "01/04/2021"));//test case 3
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.GENERALMANAGER, "02/05/2021", "01/05/2021"));//test case 4
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.ASSISTANTMANAGER, "01/05/2018", "01/05/2021"));//test case 5
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.GENERALMANAGER, "01/06/2021", "31/12/2020"));//test case 6
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.MANAGER, "01/06/2018", "31/12/2020"));//test case 7
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.ASSISTANTMANAGER, "01/06/2018", "31/12/2020"));//test case 8
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.SENIORENGINEER, "01/06/20218", "31/12/2020"));//test case 9
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.JUNIORENGINEER, "01/06/2018", "31/12/2020"));//test case 10
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.TEKNISI, "01/06/2018", "31/12/2020"));//test case 11
        System.out.println(pajak.hitungBiayaJabatan(Pajak. Jabatan.DRIVER, "01/06/2018", "31/12/2020"));//test case 12
    }
}
