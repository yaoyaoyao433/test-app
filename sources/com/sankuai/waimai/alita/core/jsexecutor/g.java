package com.sankuai.waimai.alita.core.jsexecutor;

import android.support.annotation.NonNull;
import java.util.List;
import java.util.concurrent.Executor;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface g {
    Executor a();

    void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, com.sankuai.waimai.alita.core.engine.h hVar);

    void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, String str2, JSONObject jSONObject, com.sankuai.waimai.alita.core.engine.h hVar);

    void a(com.sankuai.waimai.alita.core.jsexecutor.task.d dVar, String str, List<JSONObject> list, com.sankuai.waimai.alita.core.engine.h hVar);

    void a(@NonNull Runnable runnable);

    void a(@NonNull Runnable runnable, long j);

    void b(String str, String str2, String str3);
}
