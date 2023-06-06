package com.sankuai.waimai.store.cell.core;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class CellUiConfig {
    public static ChangeQuickRedirect a;
    public boolean b;
    public boolean c;
    public int d;
    public int e;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface AddLayoutType {
        public static final int ADD_LAYOUT_TYPE_ADD_AND_DEC = 2;
        public static final int ADD_LAYOUT_TYPE_ADD_DEFAULT = 3;
        public static final int ADD_LAYOUT_TYPE_ONLY_ADD = 1;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public @interface CellBackgroundType {
        public static final int NONE = 4;
        public static final int RECTANGLE = 0;
        public static final int ROUND = 1;
        public static final int ROUND_LEFT = 2;
        public static final int ROUND_RIGHT = 3;
    }

    public CellUiConfig() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d63966ebad8142843dd384826ab4eb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d63966ebad8142843dd384826ab4eb");
            return;
        }
        this.b = true;
        this.c = false;
        this.d = 3;
        this.e = 4;
    }

    public static CellUiConfig a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7782fe3bfd56ade6349900c711ac3890", RobustBitConfig.DEFAULT_VALUE) ? (CellUiConfig) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7782fe3bfd56ade6349900c711ac3890") : new CellUiConfig();
    }
}
