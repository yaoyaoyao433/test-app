package com.meituan.android.common.dfingerprint;
/* loaded from: classes2.dex */
public interface DFPInfoProvider {
    String business();

    String dpid();

    String getChannel();

    String getMagicNumber();

    String getPushToken();

    String getUUID();

    String optional();

    String source();
}
