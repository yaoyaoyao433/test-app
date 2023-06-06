package com.dianping.picassomodule.utils;

import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.node.adapter.AttachStatusCollection;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static void a(AttachStatusCollection attachStatusCollection, ScrollDirection scrollDirection) {
        Object[] objArr = {attachStatusCollection, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3dd95b149e988c44bf384d638f87dad0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3dd95b149e988c44bf384d638f87dad0");
        } else {
            a(attachStatusCollection, scrollDirection, HotZoneLocation.ScrollOrientation.HORIZONTAL);
        }
    }

    public static void a(AttachStatusCollection attachStatusCollection, ScrollDirection scrollDirection, HotZoneLocation.ScrollOrientation scrollOrientation) {
        Object[] objArr = {attachStatusCollection, scrollDirection, scrollOrientation};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72c802ebd75ded6294e6621d640e386e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72c802ebd75ded6294e6621d640e386e");
        } else if (attachStatusCollection != null) {
            attachStatusCollection.updateFistLastPositionInfo(0, scrollOrientation, scrollDirection);
        }
    }

    public static void b(AttachStatusCollection attachStatusCollection, ScrollDirection scrollDirection) {
        Object[] objArr = {attachStatusCollection, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "907b4fd4ee8e5c98085be9cf56dfd10f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "907b4fd4ee8e5c98085be9cf56dfd10f");
        } else {
            a(attachStatusCollection, scrollDirection, false);
        }
    }

    public static void a(AttachStatusCollection attachStatusCollection, ScrollDirection scrollDirection, boolean z) {
        Object[] objArr = {attachStatusCollection, scrollDirection, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cbfa287206df8fda77a2af96832174dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cbfa287206df8fda77a2af96832174dd");
        } else if (attachStatusCollection != null) {
            ScrollDirection addOuterPrefix = ScrollDirection.addOuterPrefix(scrollDirection);
            attachStatusCollection.clearAttachStatus();
            attachStatusCollection.setNeedLoadStore(true);
            attachStatusCollection.updateFistLastPositionInfo(0, HotZoneLocation.ScrollOrientation.HORIZONTAL, addOuterPrefix, z);
            attachStatusCollection.clearStoredPositionInfo();
        }
    }

    public static void c(AttachStatusCollection attachStatusCollection, ScrollDirection scrollDirection) {
        Object[] objArr = {attachStatusCollection, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "852de50177d3d66ff0009ef3151bacc3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "852de50177d3d66ff0009ef3151bacc3");
        } else if (attachStatusCollection != null) {
            ScrollDirection addOuterPrefix = ScrollDirection.addOuterPrefix(scrollDirection);
            if (scrollDirection == ScrollDirection.GO_BACK) {
                attachStatusCollection.clearCurrentInfo();
            } else {
                attachStatusCollection.storeCurrentInfo();
                attachStatusCollection.clearCurrentInfo();
            }
            attachStatusCollection.setNeedLoadStore(false);
            attachStatusCollection.updateProcessors(addOuterPrefix);
        }
    }
}
