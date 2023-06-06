package com.meituan.msc.jse.bridge.queue;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class MessageQueueThreadSpec {
    public static final long DEFAULT_STACK_SIZE_BYTES = 0;
    private static final MessageQueueThreadSpec MAIN_UI_SPEC = new MessageQueueThreadSpec(ThreadType.MAIN_UI, "main_ui");
    public static ChangeQuickRedirect changeQuickRedirect;
    private final String mName;
    private final long mStackSize;
    private final ThreadType mThreadType;

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public enum ThreadType {
        MAIN_UI,
        NEW_BACKGROUND;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        ThreadType() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "259b69d50c9758337aee2b83d8515cce", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "259b69d50c9758337aee2b83d8515cce");
            }
        }

        public static ThreadType valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ac40612794b9d9ed2768d2a22e71dc26", RobustBitConfig.DEFAULT_VALUE) ? (ThreadType) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ac40612794b9d9ed2768d2a22e71dc26") : (ThreadType) Enum.valueOf(ThreadType.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static ThreadType[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "244b985862522d72e2e6bf505abcafb4", RobustBitConfig.DEFAULT_VALUE) ? (ThreadType[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "244b985862522d72e2e6bf505abcafb4") : (ThreadType[]) values().clone();
        }
    }

    public static MessageQueueThreadSpec newUIBackgroundTreadSpec(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "824ca1740adbb34c769f57ed5486bb00", RobustBitConfig.DEFAULT_VALUE) ? (MessageQueueThreadSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "824ca1740adbb34c769f57ed5486bb00") : new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str);
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3cfa76e9fe467102b1d1edc8f33a3e8d", RobustBitConfig.DEFAULT_VALUE) ? (MessageQueueThreadSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3cfa76e9fe467102b1d1edc8f33a3e8d") : new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str);
    }

    public static MessageQueueThreadSpec newBackgroundThreadSpec(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6987f47dc26e04fc839de9c6e903e710", RobustBitConfig.DEFAULT_VALUE) ? (MessageQueueThreadSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6987f47dc26e04fc839de9c6e903e710") : new MessageQueueThreadSpec(ThreadType.NEW_BACKGROUND, str, j);
    }

    public static MessageQueueThreadSpec mainThreadSpec() {
        return MAIN_UI_SPEC;
    }

    public MessageQueueThreadSpec(ThreadType threadType, String str) {
        this(threadType, str, 0L);
        Object[] objArr = {threadType, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3367f64fbbe9d483a552ff7eee9790c3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3367f64fbbe9d483a552ff7eee9790c3");
        }
    }

    public MessageQueueThreadSpec(ThreadType threadType, String str, long j) {
        Object[] objArr = {threadType, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f57991a9e24886f7d8674d97faf4845e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f57991a9e24886f7d8674d97faf4845e");
            return;
        }
        this.mThreadType = threadType;
        this.mName = str;
        this.mStackSize = j;
    }

    public ThreadType getThreadType() {
        return this.mThreadType;
    }

    public String getName() {
        return this.mName;
    }

    public long getStackSize() {
        return this.mStackSize;
    }
}
