package com.meituan.android.uptodate.download;

import android.content.Context;
import android.os.AsyncTask;
import android.text.TextUtils;
import com.meituan.android.uptodate.model.VersionInfo;
import com.meituan.android.uptodate.model.VersionInfoBean;
import com.meituan.android.uptodate.retrofit.b;
import com.meituan.android.uptodate.util.d;
import com.meituan.android.uptodate.util.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Response;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a extends AsyncTask<Void, Void, VersionInfo> {
    public static ChangeQuickRedirect d;
    private long a;
    private String b;
    private String c;
    private long e;
    private String f;
    private long g;
    private boolean h;
    private Context i;
    private Map<String, String> j;

    public a(Context context, long j, String str, String str2, long j2, String str3, long j3, boolean z, Map<String, String> map) {
        Object[] objArr = {context, new Long(j), str, str2, new Long(j2), str3, new Long(j3), Byte.valueOf(z ? (byte) 1 : (byte) 0), map};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb2b7a2bac70c2fbbfcc9d656bb0485", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb2b7a2bac70c2fbbfcc9d656bb0485");
            return;
        }
        this.i = context;
        this.a = j;
        this.b = str;
        this.c = str2;
        this.e = j2;
        this.f = str3;
        this.g = j3;
        this.h = z;
        this.j = map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    public VersionInfo doInBackground(Void... voidArr) {
        Object[] objArr = {voidArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "55d05de6124867ba6f9492dfa2b2f48b", RobustBitConfig.DEFAULT_VALUE)) {
            return (VersionInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "55d05de6124867ba6f9492dfa2b2f48b");
        }
        String str = "";
        try {
            if (this.h) {
                str = d.e(this.i);
                if (TextUtils.isEmpty(str)) {
                    g.a(this.i, "oldMd5 null", 29);
                }
            }
            String str2 = str;
            b a = b.a(this.i);
            String str3 = this.c;
            long j = this.a;
            String str4 = this.b;
            String valueOf = String.valueOf(this.e);
            String str5 = this.f;
            String valueOf2 = String.valueOf(this.g);
            Map<String, String> map = this.j;
            Object[] objArr2 = {str3, new Long(j), str4, str2, valueOf, str5, valueOf2, map};
            ChangeQuickRedirect changeQuickRedirect2 = b.a;
            Response<VersionInfoBean> a2 = (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "e1abc8a6fb4182a98570847cf2e676dd", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "e1abc8a6fb4182a98570847cf2e676dd") : a.a(str3, j, str4, str2, valueOf, str5, valueOf2, map, "", 0)).a();
            if (a2 == null || a2.e() == null || a2.e().versioninfo == null) {
                return null;
            }
            return a2.e().versioninfo;
        } catch (Exception e) {
            VersionInfo versionInfo = new VersionInfo();
            versionInfo.exception = e;
            return versionInfo;
        }
    }
}
