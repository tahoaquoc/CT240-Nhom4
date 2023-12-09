/***********************************************************************
 * Module:  PhieuBaoHanh.java
 * Author:  Admin
 * Purpose: Defines the Class PhieuBaoHanh
 ***********************************************************************/

import java.util.*;

/** @pdOid 99322e4b-9fec-4129-9a4b-c16fb81f3c13 */
public class PhieuBaoHanh {
   /** @pdOid 5390aad3-b788-41f4-9c1b-0b3397fc790f */
   private int pbhId;
   /** @pdOid e8ca2543-1ca5-4752-b17e-04235a457b5e */
   private Date pbhNgay;
   /** @pdOid 39370a9a-2564-42e9-95cc-38e76fc3c8c7 */
   private int pbhSoThangBH;
   
   /** @pdRoleInfo migr=no name=HoaDon assc=association6 mult=1..1 */
   public HoaDon hoaDon;

}