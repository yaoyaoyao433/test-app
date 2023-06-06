package com.sankuai.waimai.platform.widget.filterbar.view.view.bezier;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class BezierUtil {
    public static ChangeQuickRedirect a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static List<BezierPoint> a(List<PointF> list, double d, double d2, double d3, double d4) {
        PointF pointF;
        PointF pointF2;
        Object[] objArr = {list, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0e035b7e89ae396a59411e773a9ef1f7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0e035b7e89ae396a59411e773a9ef1f7");
        }
        ArrayList arrayList = new ArrayList();
        if (a(list) < 3) {
            return arrayList;
        }
        PointF pointF3 = new PointF();
        PointF pointF4 = new PointF();
        a(list, d, d2, d3, d4, pointF3, pointF4);
        PointF pointF5 = list.get(0);
        PointF pointF6 = list.get(1);
        PointF pointF7 = list.get(2);
        BezierPoint bezierPoint = new BezierPoint(pointF5, pointF3, new PointF((float) (pointF6.x - ((pointF7.x - pointF5.x) * d2)), (float) (pointF6.y - ((pointF7.y - pointF5.y) * d2))), pointF6);
        ArrayList arrayList2 = arrayList;
        arrayList2.add(bezierPoint);
        int size = list.size() - 2;
        int i = 1;
        while (i < size) {
            PointF pointF8 = list.get(i - 1);
            PointF pointF9 = list.get(i);
            int i2 = i + 1;
            PointF pointF10 = list.get(i2);
            PointF pointF11 = list.get(i + 2);
            double d5 = ((pointF9.y >= pointF8.y || pointF9.y >= pointF10.y) && (pointF9.y <= pointF8.y || pointF9.y <= pointF10.y)) ? 1 : 0;
            ArrayList arrayList3 = arrayList2;
            arrayList3.add(new BezierPoint(pointF9, new PointF((float) (pointF9.x + ((pointF10.x - pointF8.x) * d)), (float) (pointF9.y + (d5 * d * (pointF10.y - pointF8.y)))), new PointF((float) (pointF10.x - ((pointF11.x - pointF9.x) * d2)), (float) (pointF10.y - ((d5 * d2) * (pointF11.y - pointF9.y)))), pointF10));
            arrayList2 = arrayList3;
            i = i2;
            pointF4 = pointF4;
            size = size;
        }
        int i3 = size;
        ArrayList arrayList4 = arrayList2;
        PointF pointF12 = list.get(i3 - 1);
        arrayList4.add(new BezierPoint(list.get(i3), new PointF((float) (pointF.x + ((pointF2.x - pointF12.x) * d)), (float) (pointF.y + ((pointF2.y - pointF12.y) * d))), pointF4, list.get(i3 + 1)));
        return arrayList4;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(List<PointF> list, double d, double d2, double d3, double d4, PointF pointF, PointF pointF2) {
        Object[] objArr = {list, Double.valueOf(d), Double.valueOf(d2), Double.valueOf(d3), Double.valueOf(d4), pointF, pointF2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f8bb6b1c4119c6bc032acf5fbe858ced", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f8bb6b1c4119c6bc032acf5fbe858ced")).booleanValue();
        }
        if (a(list) < 2) {
            return false;
        }
        double d5 = -d3;
        double d6 = -d4;
        PointF pointF3 = list.get(0);
        PointF pointF4 = list.get(1);
        PointF pointF5 = list.get(list.size() - 1);
        PointF pointF6 = list.get(list.size() - 2);
        double cos = Math.cos(Math.toRadians(d5));
        double sin = Math.sin(Math.toRadians(d5));
        double cos2 = Math.cos(Math.toRadians(d6));
        double sin2 = Math.sin(Math.toRadians(d6));
        double d7 = d * 2.0d;
        pointF.x = (float) (pointF3.x + (cos * d7 * (pointF4.x - pointF3.x)));
        pointF.y = (float) (pointF3.y + (d7 * sin * (pointF4.y - pointF3.y)));
        double d8 = d2 * 2.0d;
        pointF2.x = (float) (pointF5.x + (d8 * cos2 * (pointF5.x - pointF6.x)));
        pointF2.y = (float) (pointF5.y + (d8 * sin2 * (pointF5.y - pointF6.y)));
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> int a(List<T> list) {
        int i = 0;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "809e75e0994b7bcd409a8464105c7bac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "809e75e0994b7bcd409a8464105c7bac")).intValue();
        }
        if (list == null) {
            return -1;
        }
        for (T t : list) {
            if (t == null) {
                return -1;
            }
            i++;
        }
        return i;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class BezierPoint implements Parcelable {
        public static final Parcelable.Creator<BezierPoint> CREATOR = new Parcelable.Creator<BezierPoint>() { // from class: com.sankuai.waimai.platform.widget.filterbar.view.view.bezier.BezierUtil.BezierPoint.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ BezierPoint createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f98825196c06ce972f058ed2a5f0e835", RobustBitConfig.DEFAULT_VALUE) ? (BezierPoint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f98825196c06ce972f058ed2a5f0e835") : new BezierPoint(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ BezierPoint[] newArray(int i) {
                return new BezierPoint[i];
            }
        };
        public static ChangeQuickRedirect a;
        PointF b;
        PointF c;
        PointF d;
        PointF e;

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public BezierPoint(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
            Object[] objArr = {pointF, pointF2, pointF3, pointF4};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55879e49f9deb7da869c800df0eb8a34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55879e49f9deb7da869c800df0eb8a34");
                return;
            }
            this.b = pointF;
            this.c = pointF2;
            this.d = pointF3;
            this.e = pointF4;
        }

        public BezierPoint(Parcel parcel) {
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53a2a7dde2baa4240e2e1fab83c661e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53a2a7dde2baa4240e2e1fab83c661e");
                return;
            }
            this.b = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
            this.c = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
            this.d = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
            this.e = (PointF) parcel.readParcelable(PointF.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "414b79fdc02530621d9514394895cb1c", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "414b79fdc02530621d9514394895cb1c");
                return;
            }
            parcel.writeParcelable(this.b, i);
            parcel.writeParcelable(this.c, i);
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.e, i);
        }
    }
}
