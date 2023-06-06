package com.sankuai.model.userlocked;

import com.google.gson.JsonElement;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface UserLockedHandler {
    void handleUserLockedError(JsonElement jsonElement) throws UserLockedErrorException;
}
