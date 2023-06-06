package com.meituan.mmp.lib.api.contacts;

import com.meituan.mmp.lib.api.ApiFunction;
import com.meituan.mmp.lib.api.Empty;
import com.meituan.mmp.main.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class AbsContactModule {

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class ChooseContact extends ApiFunction<JSONObject, ChooseContactResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ChooseContactResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public String name;
        public List<String> phoneNumbers = new ArrayList();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static abstract class GetAllContacts extends ApiFunction<Empty, GetAllContactsResult> {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class GetAllContactsResult implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public List<Person> contacts = new ArrayList();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class Person implements d {
        public static ChangeQuickRedirect changeQuickRedirect;
        public transient long contactId;
        public String name;
        public List<String> phoneNumbers;

        public Person() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d63fbc435f5c9149f17dde23d628a402", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d63fbc435f5c9149f17dde23d628a402");
            } else {
                this.phoneNumbers = new ArrayList();
            }
        }

        public boolean equals(Object obj) {
            Object[] objArr = {obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab67dd1e6fad83c709521fd8aef41e33", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab67dd1e6fad83c709521fd8aef41e33")).booleanValue();
            }
            if (this == obj) {
                return true;
            }
            return obj != null && getClass() == obj.getClass() && this.contactId == ((Person) obj).contactId;
        }

        public int hashCode() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "494869db0c06ec1450767cff4d9c4821", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "494869db0c06ec1450767cff4d9c4821")).intValue() : Objects.hash(Long.valueOf(this.contactId));
        }
    }
}
