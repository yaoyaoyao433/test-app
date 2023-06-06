package com.dianping.shield.logger;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SCLogger {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected String defaultTag;

    public SCLogger setTag(String str) {
        this.defaultTag = str;
        return this;
    }

    public void v(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "817c4dac60d49acbc7b40db1f698f976", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "817c4dac60d49acbc7b40db1f698f976");
        } else {
            v(this.defaultTag, str, objArr);
        }
    }

    public void i(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0c8ff7b3f0488302871523b2aa4b7a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0c8ff7b3f0488302871523b2aa4b7a49");
        } else {
            i(this.defaultTag, str, objArr);
        }
    }

    public void d(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b83b4229acf13d1d0f50c0db2d005ced", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b83b4229acf13d1d0f50c0db2d005ced");
        } else {
            d(this.defaultTag, str, objArr);
        }
    }

    public void w(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4c0f2da62a79f18df99de0f27a53dff8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4c0f2da62a79f18df99de0f27a53dff8");
        } else {
            w(this.defaultTag, str, objArr);
        }
    }

    public void e(String str, Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "042502407afff9a68af078f03122daf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "042502407afff9a68af078f03122daf9");
        } else {
            e(this.defaultTag, str, objArr);
        }
    }

    public static void v(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "58d5072f1dac3fcdd198d2862f8971f5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "58d5072f1dac3fcdd198d2862f8971f5");
        } else {
            String.format(str2, objArr);
        }
    }

    public static void i(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d25508c87d2da159546a019fbfd8cee6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d25508c87d2da159546a019fbfd8cee6");
        } else {
            String.format(str2, objArr);
        }
    }

    public static void d(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "babb7fea23410d6a2d1ebdd365e9fb53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "babb7fea23410d6a2d1ebdd365e9fb53");
        } else {
            String.format(str2, objArr);
        }
    }

    public static void w(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "551295a7d4c78a83933d4c56bbe3b613", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "551295a7d4c78a83933d4c56bbe3b613");
        } else {
            String.format(str2, objArr);
        }
    }

    public static void e(String str, String str2, Object... objArr) {
        Object[] objArr2 = {str, str2, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "097deb68f1773c3fc8e3e9e5afc3dc7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "097deb68f1773c3fc8e3e9e5afc3dc7e");
        } else {
            Log.e(str, String.format(str2, objArr));
        }
    }
}
