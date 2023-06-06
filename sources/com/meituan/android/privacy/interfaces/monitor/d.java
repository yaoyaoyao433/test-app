package com.meituan.android.privacy.interfaces.monitor;

import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public int e;
    public boolean f;
    public long g;
    public long h;
    public String i;
    public String j;
    public String k;
    public String l;
    public String m;
    public boolean n;
    public boolean o;
    public String p;
    public String q;
    public boolean r;
    public Object s;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "054fc1368106aef20446887037d6ff80", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "054fc1368106aef20446887037d6ff80");
        } else {
            this.g = SystemClock.elapsedRealtime();
        }
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0b578594731fca3c0e4289425af9ac0", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0b578594731fca3c0e4289425af9ac0");
        }
        return "PermissionMonitorRecord{type='" + this.b + "', token='" + this.c + "', permissionId='" + this.d + "', code=" + this.e + ", background=" + this.f + ", start=" + this.g + ", end=" + this.h + ", appAlert='" + this.i + "', sysAlert='" + this.j + "', calledAPI='" + this.k + "', apiAuthorization='" + this.l + "', callingSysAPI='" + this.m + "', notLog=" + this.n + ", hash=" + this.p + ", cacheDuration=" + this.q + ", validToken=" + this.r + '}';
    }
}
