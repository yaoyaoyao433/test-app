package com.dianping.portal.feature;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface c {
    String getConfigProperty(String str);

    g getConfigPropertyHolder(String str);

    void registerConfigProperty(String str, b bVar);

    boolean setPropertyHolderInterface(String str, g gVar);

    void unRegisterConfigProperty(String str, b bVar);
}
