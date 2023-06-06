package com.meituan.android.quickpass.uptsm.manage;

import android.content.Context;
import android.os.RemoteException;
import android.util.Log;
import com.meituan.android.quickpass.qpdev.QuickPassDevManager;
import com.meituan.android.quickpass.uptsm.common.utils.d;
import com.meituan.android.quickpass.uptsm.common.utils.h;
import com.meituan.android.quickpass.uptsm.constant.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.UPTsmAddon;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private UPTsmAddon b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9b2099366c0e27365ff2d58e5164f6b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9b2099366c0e27365ff2d58e5164f6b");
            return;
        }
        QuickPassDevManager a2 = QuickPassDevManager.a();
        Object[] objArr2 = {"TSM 组件调试", "com.meituan.android.quickpass.uptsm.tsmtest"};
        ChangeQuickRedirect changeQuickRedirect2 = QuickPassDevManager.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "4549f01497805ab5d8ebeaa9b1b7a3f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "4549f01497805ab5d8ebeaa9b1b7a3f2");
            return;
        }
        if (a2.c == null) {
            a2.c = new HashMap();
        }
        a2.c.put("TSM 组件调试", "com.meituan.android.quickpass.uptsm.tsmtest");
    }

    public final int a(Context context) throws Exception {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "548d8e2d437324509d4a5d997ac1f882", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "548d8e2d437324509d4a5d997ac1f882")).intValue();
        }
        h.a("初始化TSM");
        com.meituan.android.quickpass.uptsm.common.utils.b.b("初始化");
        this.b = UPTsmAddon.getInstance(context);
        if (c()) {
            h.a("没有listener，需要new");
            this.b.addConnectionListener(new c(this.b));
        } else {
            h.a("已经存在Listener，不需要new");
        }
        if (this.b.bind()) {
            h.a("绑定成功");
            if (this.b.isConnected()) {
                int b = b();
                if (b == -104 || b == -4) {
                    try {
                        d.a(a.b.h, a.C0360a.a);
                        int init = this.b.init(null, new TSMCallBack(1));
                        if (init != 0) {
                            d.a(a.b.g, a.C0360a.i + init);
                            return init;
                        }
                    } catch (RemoteException e) {
                        h.b(Log.getStackTraceString(e));
                        com.meituan.android.quickpass.uptsm.common.utils.b.a(e, "TSM_INIT");
                    }
                } else if (b != 0) {
                    return b;
                }
            }
            com.meituan.android.quickpass.uptsm.common.utils.a.a("b_q6vieh5a", "c_ogr68a1g", Boolean.TRUE);
            return 0;
        }
        h.a("绑定失败");
        return 110;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.quickpass.uptsm.manage.b.a
            java.lang.String r10 = "071f51c78fe81e14da728fef6502f132"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1f:
            r0 = -100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "获取pay状态:"
            r1.<init>(r2)
            com.unionpay.tsmservice.UPTsmAddon r2 = r11.b
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r1)
            java.lang.String r1 = "获取手机pay状态"
            com.meituan.android.quickpass.uptsm.common.utils.b.b(r1)
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            if (r1 == 0) goto L89
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L89
            java.lang.String r1 = com.meituan.android.quickpass.uptsm.constant.a.b.l     // Catch: android.os.RemoteException -> L77
            int r2 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.a     // Catch: android.os.RemoteException -> L77
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r1, r2)     // Catch: android.os.RemoteException -> L77
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b     // Catch: android.os.RemoteException -> L77
            r2 = 0
            com.meituan.android.quickpass.uptsm.manage.TSMCallBack r3 = new com.meituan.android.quickpass.uptsm.manage.TSMCallBack     // Catch: android.os.RemoteException -> L77
            r4 = 2
            r3.<init>(r4)     // Catch: android.os.RemoteException -> L77
            int r1 = r1.getVendorPayStatus(r2, r3)     // Catch: android.os.RemoteException -> L77
            java.util.HashMap r0 = new java.util.HashMap     // Catch: android.os.RemoteException -> L75
            r0.<init>()     // Catch: android.os.RemoteException -> L75
            java.lang.String r2 = "result"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.os.RemoteException -> L75
            r0.put(r2, r3)     // Catch: android.os.RemoteException -> L75
            java.lang.String r2 = "获取手机pay状态同步结果"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r2, r0)     // Catch: android.os.RemoteException -> L75
            goto L91
        L75:
            r0 = move-exception
            goto L7b
        L77:
            r1 = move-exception
            r0 = r1
            r1 = -100
        L7b:
            java.lang.String r2 = "getPayStatus"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r0, r2)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            com.meituan.android.quickpass.uptsm.common.utils.h.b(r0)
            goto L91
        L89:
            java.lang.String r0 = "未初始化"
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r0)
            r1 = -104(0xffffffffffffff98, float:NaN)
        L91:
            if (r1 == 0) goto L9b
            java.lang.String r0 = com.meituan.android.quickpass.uptsm.constant.a.b.k
            int r2 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.k
            int r2 = r2 + r1
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r0, r2)
        L9b:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.quickpass.uptsm.manage.b.a():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b() {
        /*
            r11 = this;
            r0 = 0
            java.lang.Object[] r8 = new java.lang.Object[r0]
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.quickpass.uptsm.manage.b.a
            java.lang.String r10 = "3a930ea6dd474ef452d5bb12fc34f5a3"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r8
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L1f
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r8, r11, r9, r0, r10)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1f:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "获取SE状态:"
            r0.<init>(r1)
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r0)
            java.lang.String r0 = "b_2nb31qis"
            java.lang.String r1 = "c_5ifn958x"
            r2 = 0
            com.meituan.android.quickpass.uptsm.common.utils.a.a(r0, r1, r2)
            r0 = -100
            java.lang.String r1 = "获取SE状态"
            com.meituan.android.quickpass.uptsm.common.utils.b.b(r1)
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            if (r1 == 0) goto L90
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto L90
            java.lang.String r1 = com.meituan.android.quickpass.uptsm.constant.a.b.j     // Catch: android.os.RemoteException -> L7e
            int r3 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.a     // Catch: android.os.RemoteException -> L7e
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r1, r3)     // Catch: android.os.RemoteException -> L7e
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b     // Catch: android.os.RemoteException -> L7e
            com.meituan.android.quickpass.uptsm.manage.TSMCallBack r3 = new com.meituan.android.quickpass.uptsm.manage.TSMCallBack     // Catch: android.os.RemoteException -> L7e
            r4 = 3
            r3.<init>(r4)     // Catch: android.os.RemoteException -> L7e
            int r1 = r1.getSeId(r2, r3)     // Catch: android.os.RemoteException -> L7e
            java.util.HashMap r0 = new java.util.HashMap     // Catch: android.os.RemoteException -> L7c
            r0.<init>()     // Catch: android.os.RemoteException -> L7c
            java.lang.String r2 = "result"
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)     // Catch: android.os.RemoteException -> L7c
            r0.put(r2, r3)     // Catch: android.os.RemoteException -> L7c
            java.lang.String r2 = "获取手机SEID同步结果"
            com.meituan.android.quickpass.uptsm.common.utils.b.b(r2, r0)     // Catch: android.os.RemoteException -> L7c
            goto L98
        L7c:
            r0 = move-exception
            goto L82
        L7e:
            r1 = move-exception
            r0 = r1
            r1 = -100
        L82:
            java.lang.String r2 = "getSEID"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r0, r2)
            java.lang.String r0 = android.util.Log.getStackTraceString(r0)
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r0)
            goto L98
        L90:
            java.lang.String r0 = "未初始化"
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r0)
            r1 = -104(0xffffffffffffff98, float:NaN)
        L98:
            if (r1 == 0) goto La2
            java.lang.String r0 = com.meituan.android.quickpass.uptsm.constant.a.b.i
            int r2 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.j
            int r2 = r2 + r1
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r0, r2)
        La2:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.quickpass.uptsm.manage.b.b():int");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ea  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int a(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.quickpass.uptsm.manage.b.a
            java.lang.String r10 = "79295a796f0f17ceaa8af20121289867"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L25:
            r0 = -100
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "加密数据\tpan:"
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r2 = "\tphone:"
            r1.append(r2)
            r1.append(r13)
            com.unionpay.tsmservice.UPTsmAddon r2 = r11.b
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r1)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "pan|phone"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r4 = "|"
            r3.append(r4)
            r3.append(r13)
            java.lang.String r3 = r3.toString()
            java.lang.String r3 = com.meituan.android.quickpass.uptsm.common.rsa.a.a(r3)
            r1.put(r2, r3)
            java.lang.String r2 = "加密数据"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r2, r1)
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            if (r1 == 0) goto Le0
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto Le0
            com.unionpay.tsmservice.request.EncryptDataRequestParams r1 = new com.unionpay.tsmservice.request.EncryptDataRequestParams
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r12)
            java.lang.String r12 = "|"
            r3.append(r12)
            r3.append(r13)
            java.lang.String r12 = r3.toString()
            r2.add(r12)
            r1.setData(r2)
            java.lang.String r12 = com.meituan.android.quickpass.uptsm.constant.a.b.b     // Catch: android.os.RemoteException -> Ld0
            int r13 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.a     // Catch: android.os.RemoteException -> Ld0
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r12, r13)     // Catch: android.os.RemoteException -> Ld0
            com.unionpay.tsmservice.UPTsmAddon r12 = r11.b     // Catch: android.os.RemoteException -> Ld0
            com.meituan.android.quickpass.uptsm.manage.TSMCallBack r13 = new com.meituan.android.quickpass.uptsm.manage.TSMCallBack     // Catch: android.os.RemoteException -> Ld0
            r2 = 4
            r13.<init>(r2)     // Catch: android.os.RemoteException -> Ld0
            int r12 = r12.encryptData(r1, r13)     // Catch: android.os.RemoteException -> Ld0
            java.util.HashMap r13 = new java.util.HashMap     // Catch: android.os.RemoteException -> Lce
            r13.<init>()     // Catch: android.os.RemoteException -> Lce
            java.lang.String r0 = "result"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch: android.os.RemoteException -> Lce
            r13.put(r0, r1)     // Catch: android.os.RemoteException -> Lce
            java.lang.String r0 = "加密数据同步结果"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r0, r13)     // Catch: android.os.RemoteException -> Lce
            goto Le8
        Lce:
            r13 = move-exception
            goto Ld3
        Ld0:
            r13 = move-exception
            r12 = -100
        Ld3:
            java.lang.String r0 = "encryptData"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r13, r0)
            java.lang.String r13 = android.util.Log.getStackTraceString(r13)
            com.meituan.android.quickpass.uptsm.common.utils.h.b(r13)
            goto Le8
        Le0:
            java.lang.String r12 = "未初始化"
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r12)
            r12 = -104(0xffffffffffffff98, float:NaN)
        Le8:
            if (r12 == 0) goto Lf2
            java.lang.String r13 = com.meituan.android.quickpass.uptsm.constant.a.b.a
            int r0 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.l
            int r0 = r0 + r12
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r13, r0)
        Lf2:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.quickpass.uptsm.manage.b.a(java.lang.String, java.lang.String):int");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int b(java.lang.String r12, java.lang.String r13) {
        /*
            r11 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r8 = 0
            r0[r8] = r12
            r1 = 1
            r0[r1] = r13
            com.meituan.robust.ChangeQuickRedirect r9 = com.meituan.android.quickpass.uptsm.manage.b.a
            java.lang.String r10 = "8e8bb343cdcecb0c2e05c24a0653b53d"
            r4 = 0
            r6 = 4611686018427387904(0x4000000000000000, double:2.0)
            r1 = r0
            r2 = r11
            r3 = r9
            r5 = r10
            boolean r1 = com.meituan.robust.PatchProxy.isSupport(r1, r2, r3, r4, r5, r6)
            if (r1 == 0) goto L25
            java.lang.Object r12 = com.meituan.robust.PatchProxy.accessDispatch(r0, r11, r9, r8, r10)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            return r12
        L25:
            java.lang.String r0 = "添加银行卡到pay"
            com.meituan.android.quickpass.uptsm.common.utils.b.b(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "添加银行卡到pay:"
            r0.<init>(r1)
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.meituan.android.quickpass.uptsm.common.utils.h.a(r0)
            r0 = -100
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            if (r1 == 0) goto Lc6
            com.unionpay.tsmservice.UPTsmAddon r1 = r11.b
            boolean r1 = r1.isConnected()
            if (r1 == 0) goto Lc6
            com.unionpay.tsmservice.request.AddCardToVendorPayRequestParams r1 = new com.unionpay.tsmservice.request.AddCardToVendorPayRequestParams
            r1.<init>()
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            java.lang.String r3 = "cardType"
            java.lang.String r4 = "DEBIT"
            r2.putString(r3, r4)
            java.lang.String r3 = "issuerId"
            r2.putString(r3, r12)
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            java.lang.String r3 = "cardInfo"
            r12.put(r3, r13)     // Catch: org.json.JSONException -> L73
            goto L7b
        L73:
            r13 = move-exception
            java.lang.String r13 = android.util.Log.getStackTraceString(r13)
            com.meituan.android.quickpass.uptsm.common.utils.h.b(r13)
        L7b:
            java.lang.String r13 = "cardInfo"
            java.lang.String r12 = r12.toString()
            r2.putString(r13, r12)
            r1.setParams(r2)
            java.lang.String r12 = com.meituan.android.quickpass.uptsm.constant.a.b.d     // Catch: android.os.RemoteException -> Lb6
            int r13 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.a     // Catch: android.os.RemoteException -> Lb6
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r12, r13)     // Catch: android.os.RemoteException -> Lb6
            com.unionpay.tsmservice.UPTsmAddon r12 = r11.b     // Catch: android.os.RemoteException -> Lb6
            com.meituan.android.quickpass.uptsm.manage.TSMCallBack r13 = new com.meituan.android.quickpass.uptsm.manage.TSMCallBack     // Catch: android.os.RemoteException -> Lb6
            r2 = 5
            r13.<init>(r2)     // Catch: android.os.RemoteException -> Lb6
            com.meituan.android.quickpass.uptsm.manage.TSMProgressCallBack r2 = com.meituan.android.quickpass.uptsm.manage.TSMProgressCallBack.a.a()     // Catch: android.os.RemoteException -> Lb6
            int r12 = r12.addCardToVendorPay(r1, r13, r2)     // Catch: android.os.RemoteException -> Lb6
            java.util.HashMap r13 = new java.util.HashMap     // Catch: android.os.RemoteException -> Lb4
            r13.<init>()     // Catch: android.os.RemoteException -> Lb4
            java.lang.String r0 = "result"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r12)     // Catch: android.os.RemoteException -> Lb4
            r13.put(r0, r1)     // Catch: android.os.RemoteException -> Lb4
            java.lang.String r0 = "添加银行卡到手机pay同步结果"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r0, r13)     // Catch: android.os.RemoteException -> Lb4
            goto Lce
        Lb4:
            r13 = move-exception
            goto Lb9
        Lb6:
            r13 = move-exception
            r12 = -100
        Lb9:
            java.lang.String r0 = "addCardtoPay"
            com.meituan.android.quickpass.uptsm.common.utils.b.a(r13, r0)
            java.lang.String r13 = android.util.Log.getStackTraceString(r13)
            com.meituan.android.quickpass.uptsm.common.utils.h.b(r13)
            goto Lce
        Lc6:
            java.lang.String r12 = "未初始化"
            com.meituan.android.quickpass.uptsm.common.utils.h.b(r12)
            r12 = -104(0xffffffffffffff98, float:NaN)
        Lce:
            if (r12 == 0) goto Ld8
            java.lang.String r13 = com.meituan.android.quickpass.uptsm.constant.a.b.c
            int r0 = com.meituan.android.quickpass.uptsm.constant.a.C0360a.m
            int r0 = r0 + r12
            com.meituan.android.quickpass.uptsm.common.utils.d.a(r13, r0)
        Ld8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.android.quickpass.uptsm.manage.b.b(java.lang.String, java.lang.String):int");
    }

    private boolean c() {
        Field[] declaredFields;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f9f2bdee847593f5ef4f14f51e1d38", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f9f2bdee847593f5ef4f14f51e1d38")).booleanValue();
        }
        for (Field field : this.b.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.getType().getName().equals(ArrayList.class.getName())) {
                field.setAccessible(true);
                try {
                    ArrayList arrayList = (ArrayList) field.get(this.b);
                    if (arrayList.size() == 0) {
                        return true;
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((UPTsmAddon.UPTsmConnectionListener) it.next()) instanceof c) {
                            return false;
                        }
                    }
                    return true;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a {
        public static b a = new b();

        public static b a() {
            return a;
        }
    }
}
