package Day4.DongGoi_Ex1;

import java.nio.Buffer;

public class VanBan {
    private String noiDung;

    public VanBan(String noiDung) {
        this.noiDung = noiDung;
    }

    public VanBan() {
    }

    public String getNoiDung() {
        return noiDung;
    }

    public void setNoiDung(String noiDung) {
        this.noiDung = noiDung;
    }

    public String vietHoaToanBo() {
        String tmp = noiDung.toUpperCase();
        return tmp;
    }

    public String vietThuongToanBo() {
        String tmp = noiDung.toLowerCase();
        return tmp;
    }

    public String chuanHoaVanBan() {
        String tmp = noiDung.trim().replaceAll("\\s+", " ");
        return tmp;
    }

    public long demSoTu() {
        StringBuffer buffer = new StringBuffer(noiDung);
        long size = 0;
        // Nhận diện khi từ ở vị trí thứ i là khoảng trắng và kí tự thứ i + 1 không phải khoảng trắng
        for (int i = 0; i < buffer.length() - 1; i++) {
            if (buffer.charAt(i) == ' ' && buffer.charAt(i + 1) != ' ') {
                size++;
            }
        }
        return size;
    }

    public String vietHoaMoiTuDauTien() {
        noiDung = vietThuongToanBo();
        StringBuffer buffer = new StringBuffer(noiDung);
        buffer.setCharAt(0, Character.toUpperCase(buffer.charAt(0)));
        for (int i = 1; i < buffer.length() - 1; i++) {
            if (buffer.charAt(i) == ' ' && buffer.charAt(i + 1) != ' ') {
                buffer.setCharAt(i + 1, Character.toUpperCase(buffer.charAt(i + 1)));
            }
        }
        return buffer.toString();
    }

    @Override
    public String toString() {
        return noiDung;
    }
}
