/***********************************************************************
 * Module:  ChiTietHoaDon.java
 * Author:  Admin
 * Purpose: Defines the Class ChiTietHoaDon
 ***********************************************************************/

import java.util.*;

/** @pdOid 41f9adf2-0620-46d4-88e8-3972b793309e */
public class ChiTietHoaDon {
   /** @pdRoleInfo migr=no name=Series assc=association10 coll=java.util.Collection impl=java.util.HashSet mult=1..* */
   public java.util.Collection<Series> series;
   /** @pdRoleInfo migr=no name=HoaDon assc=association11 mult=1..1 */
   public HoaDon hoaDon;
   
   
   /** @pdGenerated default getter */
   public java.util.Collection<Series> getSeries() {
      if (series == null)
         series = new java.util.HashSet<Series>();
      return series;
   }
   
   /** @pdGenerated default iterator getter */
   public java.util.Iterator getIteratorSeries() {
      if (series == null)
         series = new java.util.HashSet<Series>();
      return series.iterator();
   }
   
   /** @pdGenerated default setter
     * @param newSeries */
   public void setSeries(java.util.Collection<Series> newSeries) {
      removeAllSeries();
      for (java.util.Iterator iter = newSeries.iterator(); iter.hasNext();)
         addSeries((Series)iter.next());
   }
   
   /** @pdGenerated default add
     * @param newSeries */
   public void addSeries(Series newSeries) {
      if (newSeries == null)
         return;
      if (this.series == null)
         this.series = new java.util.HashSet<Series>();
      if (!this.series.contains(newSeries))
         this.series.add(newSeries);
   }
   
   /** @pdGenerated default remove
     * @param oldSeries */
   public void removeSeries(Series oldSeries) {
      if (oldSeries == null)
         return;
      if (this.series != null)
         if (this.series.contains(oldSeries))
            this.series.remove(oldSeries);
   }
   
   /** @pdGenerated default removeAll */
   public void removeAllSeries() {
      if (series != null)
         series.clear();
   }

}