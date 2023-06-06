package com.meituan.android.httpdns;

import com.meituan.robust.ChangeQuickRedirect;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class DnsResult {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DnsRecord dnsRecord;
    public int resultCode;

    public int getResultCode() {
        return this.resultCode;
    }

    public void setResultCode(int i) {
        this.resultCode = i;
    }

    public DnsRecord getDnsRecord() {
        return this.dnsRecord;
    }

    public void setDnsRecord(DnsRecord dnsRecord) {
        this.dnsRecord = dnsRecord;
    }
}
