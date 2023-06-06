package com.sankuai.titans.protocol.context;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface ITitansWebPageContext {
    ITitansContainerContext getContainerContext();

    String getOriginalUrl();

    long getPageStartedTime();

    String getReferrer();

    String getUA();

    String getUrl();
}
