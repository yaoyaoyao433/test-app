package com.meituan.android.mrn.config;

import com.google.gson.reflect.TypeToken;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k {
    public static ChangeQuickRedirect a;
    public static k b = new k();

    public static k a() {
        return b;
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a54be4924d387d95c4f5cc0c3bd29b55", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a54be4924d387d95c4f5cc0c3bd29b55");
            return;
        }
        a("Image.enableShrink", Boolean.TYPE, Boolean.FALSE, "是否启用远程缩略");
        a("Image.shrinkRatio", Float.TYPE, Float.valueOf(2.0f), "远程缩略比例");
        a("Image.transformToWebp", Boolean.TYPE, Boolean.FALSE, "是否将图片格式转换为webp");
        a("Image.shrinkGif", Boolean.TYPE, Boolean.TRUE, "是否转换gif图片");
        a("Image.strictShrinkRatio", Float.TYPE, Float.valueOf(1.0f), "严格模式的缩放比例");
        a("Image.strictShrinkWhiteList", new TypeToken<List<String>>() { // from class: com.meituan.android.mrn.config.k.1
        }.getType(), Collections.emptyList(), "启用严格模式的Bundle白名单");
        a("Image.shouldDestroyDomeTreeOriginal", Boolean.TYPE, Boolean.FALSE, "是否采取系统API方式来销毁Dom树节点");
        a("Image.mrnBoxViewLoadTimeout", Long.TYPE, 3500L, "MRNBoxView白屏超时阈值");
    }

    private void a(String str, Type type, Object obj, String str2) {
        Object[] objArr = {str, type, obj, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dada5aafcb76856ff11537325a9e584", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dada5aafcb76856ff11537325a9e584");
        } else {
            t.a(str, type, obj, "mrn_image_config_android", str2);
        }
    }

    public final float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "510f5643c89829efc9bb3b5b14c4734c", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "510f5643c89829efc9bb3b5b14c4734c")).floatValue() : ((Float) t.b.a("Image.shrinkRatio")).floatValue();
    }
}
