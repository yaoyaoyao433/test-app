package com.meituan.android.paybase.fingerprint.util;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.android.paybase.fingerprint.bean.UpLoadSoterKeyResult;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.e;
import com.meituan.android.paybase.fingerprint.soter.soterexternal.f;
import com.meituan.android.paybase.net.PayBaseSerivce;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements f, com.meituan.android.paybase.retrofit.b {
    public static ChangeQuickRedirect a;
    private Context b;
    private String c;
    private String d;
    private Map<String, String> e;

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestStart(int i) {
    }

    public d(Context context, String str, Map<String, String> map) {
        Object[] objArr = {context, str, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8bbfddfeffad8b61fbd2ead8ddb5678", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8bbfddfeffad8b61fbd2ead8ddb5678");
            return;
        }
        this.d = "";
        this.b = context.getApplicationContext();
        this.e = map;
        this.c = str;
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestSucc(int i, Object obj) {
        Object[] objArr = {Integer.valueOf(i), obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea09b3e25d3c3cd7328ef21c3f70f770", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea09b3e25d3c3cd7328ef21c3f70f770");
            return;
        }
        UpLoadSoterKeyResult upLoadSoterKeyResult = (UpLoadSoterKeyResult) obj;
        if (upLoadSoterKeyResult == null || upLoadSoterKeyResult.getSoterVerifyStatus() != 0) {
            com.meituan.android.paybase.common.analyse.a.a("UpLoadSoterKeyService", "onRequestSucc", "up_load_soter_key_fail", "");
            e.b(this.b, this.d);
        }
        e.c(this.b, this.d);
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestException(int i, Exception exc) {
        Object[] objArr = {Integer.valueOf(i), exc};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eabb1bf304ab65de63f2e9c2172b6403", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eabb1bf304ab65de63f2e9c2172b6403");
            return;
        }
        com.meituan.android.paybase.common.analyse.a.a("UpLoadSoterKeyService", "onRequestFail", "up_load_soter_key_fail", exc.getMessage());
        e.b(this.b, this.d);
        if (this.b != null) {
            e.c(this.b, this.d);
        }
    }

    @Override // com.meituan.android.paybase.retrofit.b
    public final void onRequestFinal(int i) {
        this.b = null;
    }

    @Override // com.meituan.android.paybase.fingerprint.soter.soterexternal.f
    public final void a(com.meituan.android.paybase.fingerprint.soter.soterexternal.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "22fe0ebae980d7ab8c0e026b162c8ae6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "22fe0ebae980d7ab8c0e026b162c8ae6");
        } else if (this.d.equals(cVar.c)) {
            String a2 = com.meituan.android.paybase.fingerprint.soter.b.a().a(this.d);
            com.meituan.android.paybase.fingerprint.soter.a.d(this.d);
            com.meituan.android.paybase.fingerprint.soter.a.b(this);
            if (e.c(cVar.b)) {
                if (com.meituan.android.paybase.fingerprint.soter.sotercore.external.a.b(a2)) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5f9ee12e0c2b0548cbd7c6a88c32b774", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5f9ee12e0c2b0548cbd7c6a88c32b774");
                    } else if (TextUtils.isEmpty(this.c)) {
                        com.meituan.android.paybase.common.analyse.a.a("UpLoadSoterKeyService", "upLoadSoterKey", "up_load_soter_key_fail", "path为空");
                    } else {
                        ((PayBaseSerivce) com.meituan.android.paybase.net.c.a().a(PayBaseSerivce.class, this, 88)).uploadSoterKey(this.c, c.a(this.d), this.e, com.meituan.android.paybase.config.a.d().o());
                    }
                    com.meituan.android.paybase.common.analyse.a.e("UpLoadSoterKeyService", "upLoadSoterKey", null);
                    return;
                }
                com.meituan.android.paybase.common.analyse.a.a("UpLoadSoterKeyService", "onProcessFinish", "no authkey", "");
                com.meituan.android.paybase.fingerprint.soter.a.a(this.b, this.d);
                com.meituan.android.paybase.fingerprint.soter.a.a(this);
                return;
            }
            com.meituan.android.paybase.common.analyse.a.a("UpLoadSoterKeyService", "onProcessFinish", "gen no key", "");
            e.b(this.b, this.d);
        }
    }
}
