/***********************************************************************
 * Module:  ThietBi.java
 * Author:  Admin
 * Purpose: Defines the Class ThietBi
 ***********************************************************************/

import java.util.*;

/** @pdOid 03cca05a-761d-4452-b113-b308fda5ead8 */
public class ThietBi {
   /** @pdOid ca095ab7-5b62-4869-8e01-57add6849dd1 */
   private int tbId;
   /** @pdOid 6af4cc77-1d34-4ef1-9628-cac61fedcadc */
   private String tbTen;
   /** @pdOid a63ea9ec-3a33-47a4-8c25-e621a600732a */
   private String tbModel;
   
   /** @pdRoleInfo migr=no name=NhaSanXuat assc=association1 mult=1..1 */
   public NhaSanXuat nhaSanXuat;
   /** @pdRoleInfo migr=no name=Loai assc=association2 mult=1..1 */
   public Loai loai;

}