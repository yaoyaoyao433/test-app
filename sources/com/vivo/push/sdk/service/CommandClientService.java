package com.vivo.push.sdk.service;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CommandClientService extends CommandService {
    @Override // com.vivo.push.sdk.service.CommandService
    protected final boolean a(String str) {
        return "com.vivo.pushclient.action.RECEIVE".equals(str);
    }
}
