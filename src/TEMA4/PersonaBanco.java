package TEMA4;

import java.util.Scanner;

public class PersonaBanco {
    private String dni="";
    private int [] cuentasBancarias;
    private int numeroDeCuentas=0;
    private boolean moroso=false;

    public PersonaBanco(int []cuentasBancarias,String dni,int numeroDeCuentas,boolean moroso){
        this.cuentasBancarias=cuentasBancarias;
        this.dni=dni;
        this.numeroDeCuentas=numeroDeCuentas;
        this.moroso=moroso;
    }
    public void crearCuentaBancaria(int []cuentasBancarias,int numeroDeCuentas){
        Scanner in =new Scanner(System.in);
        if (this.numeroDeCuentas>3){
            System.out.println("Lo siento, no puedes crear mas cuentas");
        }else{
            System.out.println("Introduce el nuevo numero de cuenta");
            int nuevaCuenta=in.nextInt();
            switch (this.numeroDeCuentas){
                case 0:
                    cuentasBancarias[0]=nuevaCuenta;
                    break;
                case 1:
                    cuentasBancarias[1]=nuevaCuenta;

                    break;
                case 2:
                    cuentasBancarias[2]=nuevaCuenta;

                    break;
            }

        }

    }
    public void morosidad(int []cuentasBancarias,boolean moroso){
        for (int i=0;i<cuentasBancarias.length;i++){
            if (cuentasBancarias[i]<0){
                System.out.println("Tu saldo es negativo, has entrado en la lista de  M O R O S O S");
                this.moroso=true;
            }
        }
    }

}
