package com.meituan.android.common.statistics.cache;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public interface ICacheHandler {
    void deleteJsonSyntaxErrorData(int i);

    void deletePostData(long j);

    int getCount();

    int getCount(int i);

    int getCount(long j);

    List<Event> getEvent(String str, String[] strArr, int i);

    void removeEvent(Event event);

    boolean removeEvent(List<Event> list);

    boolean removeEventById(List<Long> list);

    void updateJsonPackFailedCount(List<Event> list);

    void writeEvent(Event event);

    void writeEvent(List<Event> list);

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Event {
        public static ChangeQuickRedirect changeQuickRedirect;
        private String channel;
        private long ctm;
        private JSONObject environmentJson;
        private JSONObject eventJson;
        private long id;
        private int level;
        private int pfCount;

        public Event(String str, JSONObject jSONObject, JSONObject jSONObject2, int i, long j, int i2) {
            Object[] objArr = {str, jSONObject, jSONObject2, Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4403ea03c87e7cff4fa2581ce7fcede1", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4403ea03c87e7cff4fa2581ce7fcede1");
                return;
            }
            this.id = 0L;
            this.channel = str;
            this.environmentJson = jSONObject;
            this.eventJson = jSONObject2;
            this.level = i;
            this.ctm = j;
            this.pfCount = i2;
        }

        public Event(String str, String str2, String str3, int i, long j) {
            this(str, str2, str3, i);
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ab53e719d4fbd63a58e14e2a03a8805", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ab53e719d4fbd63a58e14e2a03a8805");
                return;
            }
            this.id = 0L;
            this.ctm = j;
        }

        public Event(String str, String str2, String str3, int i, long j, int i2) {
            this(str, str2, str3, i, j);
            Object[] objArr = {str, str2, str3, Integer.valueOf(i), new Long(j), Integer.valueOf(i2)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b1b172bbdb48ae728b674f9331a1d260", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b1b172bbdb48ae728b674f9331a1d260");
            } else {
                this.pfCount = i2;
            }
        }

        public Event(String str, String str2, String str3, int i) {
            Object[] objArr = {str, str2, str3, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9cb59a75473cb2ee1ccba3c40e1e8562", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9cb59a75473cb2ee1ccba3c40e1e8562");
                return;
            }
            this.id = 0L;
            this.channel = str;
            this.level = i;
            init(str2, str3);
        }

        private void init(String str, String str2) {
            Object[] objArr = {str, str2};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff5d98b8e22530ad21bb84f6816ebf8b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff5d98b8e22530ad21bb84f6816ebf8b");
                return;
            }
            try {
                this.environmentJson = new JSONObject(str);
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                this.eventJson = new JSONObject(str2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }

        public long getId() {
            return this.id;
        }

        public void setId(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab4788fc2c72414f98521d1fe5b10855", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab4788fc2c72414f98521d1fe5b10855");
            } else {
                this.id = j;
            }
        }

        public String getChannel() {
            return this.channel;
        }

        public void setChannel(String str) {
            this.channel = str;
        }

        public JSONObject getEnvironment() {
            return this.environmentJson;
        }

        public void setEnvironment(JSONObject jSONObject) {
            this.environmentJson = jSONObject;
        }

        public JSONObject getEvs() {
            return this.eventJson;
        }

        public void setEvs(JSONObject jSONObject) {
            this.eventJson = jSONObject;
        }

        public int getLevel() {
            return this.level;
        }

        public void setLevel(int i) {
            this.level = i;
        }

        public boolean compareTo(Event event) {
            Object[] objArr = {event};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "575a6b878d224ca983f416f531189e99", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "575a6b878d224ca983f416f531189e99")).booleanValue();
            }
            if (this == event) {
                return true;
            }
            return TextUtils.equals(this.channel, event.channel) && environmentEqual(event.environmentJson);
        }

        private boolean environmentEqual(JSONObject jSONObject) {
            Object[] objArr = {jSONObject};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b3d41c8b84ad5befda7890a865921568", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b3d41c8b84ad5befda7890a865921568")).booleanValue();
            }
            if (this.environmentJson == jSONObject) {
                return true;
            }
            if (this.environmentJson == null || jSONObject == null || this.environmentJson.length() != jSONObject.length()) {
                return false;
            }
            Iterator<String> keys = this.environmentJson.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.equals(this.environmentJson.optString(next), jSONObject.optString(next))) {
                    return false;
                }
            }
            return true;
        }

        public long getCtm() {
            return this.ctm;
        }

        public void setCtm(long j) {
            Object[] objArr = {new Long(j)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf6e46ec431d65f9fe5aa637b2ee6a80", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf6e46ec431d65f9fe5aa637b2ee6a80");
            } else {
                this.ctm = j;
            }
        }

        public int getPfCount() {
            return this.pfCount;
        }

        public void setPfCount(int i) {
            this.pfCount = i;
        }
    }
}
