package com.meituan.android.ptcommonim.model;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.List;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class PTIMExtensionBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    private PlatformConfig platformConfig;

    public PlatformConfig getPlatformConfig() {
        return this.platformConfig;
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public class PlatformConfig {
        public static ChangeQuickRedirect changeQuickRedirect;
        private List<Attacher> attacherList;

        public PlatformConfig() {
            Object[] objArr = {PTIMExtensionBean.this};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90b19bf7bcd735a665644f29a7774c7c", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90b19bf7bcd735a665644f29a7774c7c");
            }
        }

        public List<Attacher> getAttacherList() {
            return this.attacherList;
        }
    }

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes3.dex */
    public class Attacher {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String type;
        private String value;

        public Attacher() {
        }

        public String getType() {
            return this.type;
        }

        public String getValue() {
            return this.value;
        }
    }
}
