package ��Ʈ������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class imageFileCopy {
    public static void main(String[] args) throws IOException {
    	Scanner scn = new Scanner(System.in);
        System.out.print("���� ���� ���� �Է��ϼ��� : ");
        String inputFileName = scn.next();

        System.out.print("�����ϴ� ���� ���� �Է��ϼ��� : ");
        String outputFileName = scn.next();

        try (InputStream inputStream = new FileInputStream(inputFileName);
                OutputStream outputStream = new FileOutputStream(outputFileName)) {
                int c;

                while ((c = inputStream.read()) != -1) {
                    outputStream.write(c);
                }
            }
            System.out.println(inputFileName + "�� " + outputFileName + "(��)�� �����Ͽ����ϴ�.");

   }
}
