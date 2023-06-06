package com.meituan.msc.jse.bridge.queue;

import android.os.Build;
import android.support.annotation.Nullable;
import com.facebook.infer.annotation.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ReactQueueConfigurationSpec {
    private static final long LEGACY_STACK_SIZE_BYTES = 2000000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final MessageQueueThreadSpec mJSQueueThreadSpec;
    private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;

    public ReactQueueConfigurationSpec(MessageQueueThreadSpec messageQueueThreadSpec, MessageQueueThreadSpec messageQueueThreadSpec2) {
        Object[] objArr = {messageQueueThreadSpec, messageQueueThreadSpec2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d8c3965472985209994335c87f25f061", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d8c3965472985209994335c87f25f061");
            return;
        }
        this.mNativeModulesQueueThreadSpec = messageQueueThreadSpec;
        this.mJSQueueThreadSpec = messageQueueThreadSpec2;
    }

    public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
        return this.mNativeModulesQueueThreadSpec;
    }

    public MessageQueueThreadSpec getJSQueueThreadSpec() {
        return this.mJSQueueThreadSpec;
    }

    public static Builder builder() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "70e4b5b1e28951a431489f9d9a9beb7d", RobustBitConfig.DEFAULT_VALUE) ? (Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "70e4b5b1e28951a431489f9d9a9beb7d") : new Builder();
    }

    public static ReactQueueConfigurationSpec createDefault() {
        MessageQueueThreadSpec newBackgroundThreadSpec;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "479dbb304e5e3e3a00dc8bcceb8ca24f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ReactQueueConfigurationSpec) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "479dbb304e5e3e3a00dc8bcceb8ca24f");
        }
        if (Build.VERSION.SDK_INT < 21) {
            newBackgroundThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", LEGACY_STACK_SIZE_BYTES);
        } else {
            newBackgroundThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
        }
        return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(newBackgroundThreadSpec).build();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Builder {
        public static ChangeQuickRedirect changeQuickRedirect;
        @Nullable
        private MessageQueueThreadSpec mJSQueueSpec;
        @Nullable
        private MessageQueueThreadSpec mNativeModulesQueueSpec;

        public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            Object[] objArr = {messageQueueThreadSpec};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ca674d7bb9a2ae77a62c9ebf0067ad2", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ca674d7bb9a2ae77a62c9ebf0067ad2");
            }
            a.a(this.mNativeModulesQueueSpec == null, "Setting native modules queue spec multiple times!");
            this.mNativeModulesQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public Builder setJSQueueThreadSpec(MessageQueueThreadSpec messageQueueThreadSpec) {
            Object[] objArr = {messageQueueThreadSpec};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1464e597344be1bede0270ffbc63427c", RobustBitConfig.DEFAULT_VALUE)) {
                return (Builder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1464e597344be1bede0270ffbc63427c");
            }
            a.a(this.mJSQueueSpec == null, "Setting JS queue multiple times!");
            this.mJSQueueSpec = messageQueueThreadSpec;
            return this;
        }

        public ReactQueueConfigurationSpec build() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69d9a5cdd29e31ebeae33539f1e91d07", RobustBitConfig.DEFAULT_VALUE) ? (ReactQueueConfigurationSpec) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69d9a5cdd29e31ebeae33539f1e91d07") : new ReactQueueConfigurationSpec((MessageQueueThreadSpec) a.a(this.mNativeModulesQueueSpec), (MessageQueueThreadSpec) a.a(this.mJSQueueSpec));
        }
    }
}
