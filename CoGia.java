/***********************************************************************
 * Module:  CoGia.java
 * Author:  Admin
 * Purpose: Defines the Class CoGia
 ***********************************************************************/

import java.util.*;

/** @pdOid db0d2342-a9e2-4d1e-a5c8-6941d3fc7e81 */
public class CoGia {
   /** @pdOid 80392fe0-47e1-4d32-81ef-0b32e73c241d */
   private Date cgNgayBD;
   /** @pdOid 8d172308-b81e-4fc8-a76d-d022676c6986 */
   private Date cgNgayKT;
   /** @pdOid 09b7be99-447e-4e5d-a25a-2ef12e362f77 */
   private double coDonGiaBan;
   
   /** @pdRoleInfo migr=no name=ThietBi assc=association12 mult=1..1 */
   public ThietBi thietBi;

}