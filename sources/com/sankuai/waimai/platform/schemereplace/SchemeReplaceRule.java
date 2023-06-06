package com.sankuai.waimai.platform.schemereplace;

import android.net.Uri;
import android.support.annotation.NonNull;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public interface SchemeReplaceRule {
    void schemeReplace(@NonNull j jVar);

    boolean shouldReplace(@NonNull Uri uri);
}
