package com.sankuai.waimai.business.page.home.preload.machpreload;

import android.support.annotation.Keep;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.Objects;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes4.dex */
public class PreLoadTemplate implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String moduleId;
    public String preSetTemplateId;
    public String renderMode;
    public String templateId;

    public PreLoadTemplate(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4602b4aa24bbbc1ac1dc598decfbda21", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4602b4aa24bbbc1ac1dc598decfbda21");
            return;
        }
        this.moduleId = str;
        this.templateId = str2;
        this.preSetTemplateId = str3;
        this.renderMode = str4;
    }

    public boolean isValid() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "495dccd2e9f699a5bc94d95c1e5f533c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "495dccd2e9f699a5bc94d95c1e5f533c")).booleanValue() : (TextUtils.isEmpty(this.moduleId) || TextUtils.isEmpty(this.templateId) || TextUtils.isEmpty(this.preSetTemplateId) || !"mach".equals(this.renderMode)) ? false : true;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d904b622655e89d55039c4ece89386c9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d904b622655e89d55039c4ece89386c9")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PreLoadTemplate preLoadTemplate = (PreLoadTemplate) obj;
        return Objects.equals(this.moduleId, preLoadTemplate.moduleId) && Objects.equals(this.templateId, preLoadTemplate.templateId) && Objects.equals(this.preSetTemplateId, preLoadTemplate.preSetTemplateId) && Objects.equals(this.renderMode, preLoadTemplate.renderMode);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5c4505926fae0f44a7e34388f9d64c3e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5c4505926fae0f44a7e34388f9d64c3e")).intValue() : Objects.hash(this.moduleId, this.templateId, this.preSetTemplateId, this.renderMode);
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f96e5ca2d8a9abb69a1dc10b829db7a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f96e5ca2d8a9abb69a1dc10b829db7a");
        }
        return ", templateId='" + this.templateId;
    }
}
