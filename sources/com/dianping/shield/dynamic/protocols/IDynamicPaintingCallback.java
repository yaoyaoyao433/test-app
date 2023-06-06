package com.dianping.shield.dynamic.protocols;

import com.dianping.shield.dynamic.model.DiffableInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\u000f\b\u0000\u0010\u0001 \u0001*\u00070\u0002¢\u0006\u0002\b\u00032\u00020\u0004J\u0017\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\bJ\u0012\u0010\t\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u000bH&¨\u0006\f"}, d2 = {"Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "T", "Lcom/dianping/shield/dynamic/model/DiffableInfo;", "Lkotlin/jvm/JvmWildcard;", "", "painting", "", "moduleInfo", "(Lcom/dianping/shield/dynamic/model/DiffableInfo;)V", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface IDynamicPaintingCallback<T extends DiffableInfo> {
    void painting(@Nullable T t);

    void sendEvent(@Nullable JSONObject jSONObject);
}
