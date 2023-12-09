/***********************************************************************
 * Module:  BaoHanh.java
 * Author:  Admin
 * Purpose: Defines the Class BaoHanh
 ***********************************************************************/

import java.util.*;

/** @pdOid 50903b86-beea-4172-a24a-73158ef62223 */
public class BaoHanh {
   /** @pdOid f232dc0e-c19c-460e-a613-41c962e34374 */
   private int bhId;
   /** @pdOid 0f63d883-daf9-4b71-82f4-952839013ed2 */
   private Date bhNgay;
   /** @pdOid f0ee416d-cd75-453c-bd23-4186c02501cb */
   private String bhTinhTrang;
   /** @pdOid 29d9b721-eebb-4726-8e2e-bc966946f339 */
   private String bhGiaiPhap;
   /** @pdOid 55c30a87-78de-494a-97b5-5db4d046094e */
   private String bhKetQuaBH;
   
   /** @pdRoleInfo migr=no name=PhieuBaoHanh assc=association9 mult=1..1 */
   public PhieuBaoHanh phieuBaoHanh;

}