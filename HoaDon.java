/***********************************************************************
 * Module:  HoaDon.java
 * Author:  Admin
 * Purpose: Defines the Class HoaDon
 ***********************************************************************/

import java.util.*;

/** @pdOid 3f5bda00-09ed-456a-8974-6c101b60bb5e */
public class HoaDon {
   /** @pdOid 13a1c3ff-fe3d-4c6c-b814-e6980999e40c */
   private int hdId;
   /** @pdOid 0e4f52ae-c83f-4b80-8629-07b35872a092 */
   private String hdNgay;
   
   /** @pdRoleInfo migr=no name=NhanVien assc=association7 mult=1..1 */
   public NhanVien nhanVien;
   /** @pdRoleInfo migr=no name=KhachHang assc=association8 mult=1..1 */
   public KhachHang khachHang;

}