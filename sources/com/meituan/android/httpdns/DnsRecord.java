package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.net.InetAddress;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DnsRecord {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String domain;
    private long expireTime;
    private List<String> ipv4;
    private List<String> ipv6;
    private List<InetAddress> localDnsCacheList;
    private long optimizeHostTime;
    private List<a> optimizeMergeIpList;
    @Deprecated
    private String state;
    private long ttl;

    public String getDomain() {
        return this.domain;
    }

    public void setDomain(String str) {
        this.domain = str;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String str) {
        this.state = str;
    }

    public long getTtl() {
        return this.ttl;
    }

    public void setTtl(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f907e8008e94d95ca0f41a00949d59aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f907e8008e94d95ca0f41a00949d59aa");
        } else {
            this.ttl = j;
        }
    }

    public List<String> getIpv4() {
        return this.ipv4;
    }

    public void setIpv4(List<String> list) {
        this.ipv4 = list;
    }

    public List<String> getIpv6() {
        return this.ipv6;
    }

    public void setIpv6(List<String> list) {
        this.ipv6 = list;
    }

    public long getExpireTime() {
        return this.expireTime;
    }

    public void setExpireTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17cc978d2041fe072c0af3cc9b88d83b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17cc978d2041fe072c0af3cc9b88d83b");
        } else {
            this.expireTime = j;
        }
    }

    public long getOptimizeHostTime() {
        return this.optimizeHostTime;
    }

    public void setOptimizeHostTime(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec806c353d0f41a8d0dc46ce1441b9a0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec806c353d0f41a8d0dc46ce1441b9a0");
        } else {
            this.optimizeHostTime = j;
        }
    }

    public List<a> getOptimizeMergeIpList() {
        return this.optimizeMergeIpList;
    }

    public void setOptimizeMergeIpList(List<a> list) {
        this.optimizeMergeIpList = list;
    }

    public List<InetAddress> getLocalDnsCacheList() {
        return this.localDnsCacheList;
    }

    public void setLocalDnsCacheList(List<InetAddress> list) {
        this.localDnsCacheList = list;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class a {
        public static ChangeQuickRedirect a;
        public String b;
        public long c;
        public boolean d;
        public boolean e;

        public a(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2a3d7983d60c66e59e3d37610dfab34", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2a3d7983d60c66e59e3d37610dfab34");
                return;
            }
            this.b = str;
            this.d = z;
        }

        public final boolean a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "378ee39c39df7fa9c40515a387fe168c", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "378ee39c39df7fa9c40515a387fe168c")).booleanValue() : !x.a(this.b) && this.e;
        }
    }
}
