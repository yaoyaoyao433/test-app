package com.meituan.android.common.sniffer.network;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class NetworkInfo {
    public int code;
    public String request;
    public String response;
    public String url;

    public NetworkInfo(String str, int i, String str2, String str3) {
        this.url = str;
        this.code = i;
        this.request = str2;
        this.response = str3;
    }
}
