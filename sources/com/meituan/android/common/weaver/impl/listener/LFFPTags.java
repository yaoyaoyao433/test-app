package com.meituan.android.common.weaver.impl.listener;

import android.support.annotation.NonNull;
import com.meituan.android.common.weaver.interfaces.ffp.FFPTags;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LFFPTags implements FFPTags {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.common.weaver.interfaces.ffp.FFPTags
    @NonNull
    public Map<String, Object> ffpTags() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b24a54546c63da365abff4e338b6588", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b24a54546c63da365abff4e338b6588");
        }
        if (FFPTagsDispatch.instance.withDispatch()) {
            return FFPTagsDispatch.instance.dispatch2();
        }
        return Collections.emptyMap();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class FFPTagsDispatch extends ListenerDispatch<FFPTags, Void> {
        public static ChangeQuickRedirect changeQuickRedirect;
        public static final FFPTagsDispatch instance = new FFPTagsDispatch(FFPTags.class);

        @Override // com.meituan.android.common.weaver.impl.listener.ListenerDispatch
        public void action(FFPTags fFPTags, Void r2) {
        }

        public FFPTagsDispatch(Class<FFPTags> cls) {
            super(cls);
            Object[] objArr = {cls};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7132661e1ff8dcf572e53e98ec29ede6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7132661e1ff8dcf572e53e98ec29ede6");
            }
        }

        @NonNull
        public Map<String, Object> dispatch2() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "658f0256b0067b6c9147543c230365e3", RobustBitConfig.DEFAULT_VALUE)) {
                return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "658f0256b0067b6c9147543c230365e3");
            }
            try {
                HashMap hashMap = new HashMap();
                for (FFPTags fFPTags : this.mSet.keySet()) {
                    action(fFPTags, (Map<String, Object>) hashMap);
                }
                List<T> list = this.serviceLoaderListener;
                if (list != 0) {
                    for (T t : list) {
                        action(t, (Map<String, Object>) hashMap);
                    }
                }
                return hashMap;
            } catch (Throwable th) {
                sReporter.report(th);
                return Collections.emptyMap();
            }
        }

        private void action(@NonNull FFPTags fFPTags, @NonNull Map<String, Object> map) {
            Object[] objArr = {fFPTags, map};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4b038cbd95ff5f43f269c9f9b63953fe", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4b038cbd95ff5f43f269c9f9b63953fe");
            } else {
                map.putAll(fFPTags.ffpTags());
            }
        }
    }
}
