package com.meituan.android.common.aidata.jsengine;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;
import org.apache.flink.cep.mlink.bean.StreamData;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class InterceptorContext {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String cepId;
    public List<StreamData> events;
    public String feature;
    public int times;
}
