/***********************************************************************
 * Module:  LoHang.java
 * Author:  Admin
 * Purpose: Defines the Class LoHang
 ***********************************************************************/

import java.util.*;

/** @pdOid 48967068-1aaf-4c23-8750-4dc00eebce55 */
public class LoHang {
   /** @pdOid 575c23cf-6f75-40d6-a2c5-5291bfce2a48 */
   private int lhId;
   /** @pdOid dad28c52-2e56-4742-b6e3-cfc75abb66e9 */
   private double lhDonGiaMua;
   
   /** @pdRoleInfo migr=no name=ThietBi assc=association3 mult=1..1 */
   public ThietBi thietBi;
   /** @pdRoleInfo migr=no name=PhieuNhap assc=association13 mult=1..1 */
   public PhieuNhap phieuNhap;

}