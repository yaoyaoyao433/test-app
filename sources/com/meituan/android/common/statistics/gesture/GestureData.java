package com.meituan.android.common.statistics.gesture;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class GestureData implements Cloneable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public float endPressure;
    public float endRawX;
    public float endRawY;
    public long endTime;
    public List<GestureMoveEvent> moveEvent;
    public float startPressure;
    public float startRawX;
    public float startRawY;
    public long startTime;

    public GestureData() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8bf26162bd593c2375ae5daab636a64e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8bf26162bd593c2375ae5daab636a64e");
        } else {
            this.moveEvent = new ArrayList();
        }
    }

    public void clear() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f09db525837555cfdce8345503934d59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f09db525837555cfdce8345503934d59");
            return;
        }
        this.startRawX = 0.0f;
        this.startRawY = 0.0f;
        this.endRawX = 0.0f;
        this.endRawY = 0.0f;
        this.startTime = 0L;
        this.endTime = 0L;
        this.moveEvent.clear();
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7c1b75dcda54be8c9256c0dab9895bc9", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7c1b75dcda54be8c9256c0dab9895bc9")).booleanValue() : ((double) Math.abs(this.startRawX)) >= 1.0E-6d && ((double) Math.abs(this.startRawY)) >= 1.0E-6d && this.startTime != 0;
    }

    public Object clone() throws CloneNotSupportedException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a4f2eeac1147784eaccb95449a590c4", 6917529027641081856L)) {
            return PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a4f2eeac1147784eaccb95449a590c4");
        }
        try {
            Object clone = super.clone();
            ArrayList arrayList = (ArrayList) ((GestureData) clone).moveEvent;
            if (arrayList != null) {
                ((GestureData) clone).moveEvent = (ArrayList) arrayList.clone();
            }
            return clone;
        } catch (Throwable unused) {
            return null;
        }
    }
}
