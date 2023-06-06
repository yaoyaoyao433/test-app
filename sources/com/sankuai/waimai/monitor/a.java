package com.sankuai.waimai.monitor;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public ErrorCode b;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.monitor.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public interface InterfaceC1031a {
        String a();
    }

    public a(Context context, Throwable th) {
        ErrorCode a2;
        Object[] objArr = {context, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "beecb8685f4f8075ec7e8dc5dac7c86e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "beecb8685f4f8075ec7e8dc5dac7c86e");
            return;
        }
        Object[] objArr2 = {context, th};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "97aab7d045ef61c88026bb0079c81f31", RobustBitConfig.DEFAULT_VALUE)) {
            a2 = (ErrorCode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "97aab7d045ef61c88026bb0079c81f31");
        } else if (context != null && !com.sankuai.waimai.monitor.utils.a.a(context)) {
            a2 = new ErrorCode(ErrorCode.ERROR_TYPE_N, "10000");
        } else if (b.a() != null && com.sankuai.waimai.monitor.utils.c.a(th).getCode().equals("-1")) {
            a2 = b.a().a(th);
        } else {
            a2 = com.sankuai.waimai.monitor.utils.c.a(th);
        }
        this.b = a2;
        this.b.setContext(context);
        b(this.b);
    }

    private a(ErrorCode errorCode) {
        Object[] objArr = {errorCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd8b72893f8ec2a45ae0299ddc0eb15e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd8b72893f8ec2a45ae0299ddc0eb15e");
            return;
        }
        this.b = errorCode;
        b(this.b);
    }

    private a(Context context, int i) {
        ErrorCode errorCode;
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "236f7a9c4c53c9ceaf57e6bd16998cab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "236f7a9c4c53c9ceaf57e6bd16998cab");
            return;
        }
        Object[] objArr2 = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "963b545ea789fd69f9cace9c02eb9d13", RobustBitConfig.DEFAULT_VALUE)) {
            errorCode = (ErrorCode) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "963b545ea789fd69f9cace9c02eb9d13");
        } else {
            if (!com.sankuai.waimai.monitor.utils.a.a(context)) {
                errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_N, "10000");
            } else {
                errorCode = new ErrorCode(ErrorCode.ERROR_TYPE_B, String.valueOf(i));
            }
            errorCode.setContext(context);
        }
        this.b = errorCode;
        b(this.b);
    }

    public static a a(Context context, Throwable th) {
        Object[] objArr = {context, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b9f4c92a4d4e3bd77d5088cd1ffae58", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b9f4c92a4d4e3bd77d5088cd1ffae58") : new a(context, th);
    }

    public static a a(Context context, int i) {
        Object[] objArr = {context, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88223d5f5f7d6049d60d0d3b2ab627db", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88223d5f5f7d6049d60d0d3b2ab627db");
        }
        new StringBuilder(" buildNativeErrorCode2 context ").append(context);
        return new a(context, i);
    }

    public static a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d708838a27f4105ecd335a2ee0f5baf7", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d708838a27f4105ecd335a2ee0f5baf7") : new a(new ErrorCode("W", str));
    }

    public static a a(ErrorCode errorCode) {
        Object[] objArr = {errorCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c29e7a5c2630b9f7084dcd8e3d2708be", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c29e7a5c2630b9f7084dcd8e3d2708be") : new a(errorCode);
    }

    public final a b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce3359e0cf22189bdce9e3e7b436159a", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce3359e0cf22189bdce9e3e7b436159a");
        }
        this.b.setBusinessCode(str);
        return this;
    }

    public final String a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "33d923dfdb34b396dcac8d2c723898a5", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "33d923dfdb34b396dcac8d2c723898a5") : a(true);
    }

    private String a(boolean z) {
        Object[] objArr = {(byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1790b9d121e9028acb8d28f97222dd1a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1790b9d121e9028acb8d28f97222dd1a") : this.b.buildErrorCodeStr(true);
    }

    private void b(ErrorCode errorCode) {
        Object[] objArr = {errorCode};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f99026a2a8fb2c3cf84bd9c79c5b5ab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f99026a2a8fb2c3cf84bd9c79c5b5ab2");
        } else if (errorCode == null) {
            throw new NullPointerException("ErrorCode is Null");
        }
    }
}
