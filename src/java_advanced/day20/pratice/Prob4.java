package java_advanced.day20.pratice;

import java.io.FileOutputStream;
import java.io.OutputStream;

// 문제 4: 바이트 단위 파일 쓰기
//         byte_output.txt 파일에 "ABCDEF"를 바이트 단위로 저장하고 성공하면 "저장완료"  출력하세요
public class Prob4 {

    public static void main(String[] args) throws Exception {
        OutputStream os = new FileOutputStream("/Users/hawon/Documents/Temp/byte_output.txt");

        Byte[] array = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < array.length; i++) {
            os.write(array[i]);
        }
        os.flush();
        os.close();
    }
}
