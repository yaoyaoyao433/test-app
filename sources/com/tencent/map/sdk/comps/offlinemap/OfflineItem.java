package com.tencent.map.sdk.comps.offlinemap;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class OfflineItem {
    private String name;
    private int percentage;
    private String pinyin;
    private long size;
    private boolean upgrade = true;

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        this.name = str;
    }

    public String getPinyin() {
        return this.pinyin;
    }

    public void setPinyin(String str) {
        this.pinyin = str;
    }

    public long getSize() {
        return this.size;
    }

    public void setSize(long j) {
        this.size = j;
    }

    public boolean isUpgrade() {
        return this.upgrade;
    }

    public void setUpgrade(boolean z) {
        this.upgrade = z;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public void setPercentage(int i) {
        this.percentage = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OfflineItem) {
            OfflineItem offlineItem = (OfflineItem) obj;
            if (this.name == null ? offlineItem.name == null : this.name.equals(offlineItem.name)) {
                return this.pinyin != null ? this.pinyin.equals(offlineItem.pinyin) : offlineItem.pinyin == null;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        return ((this.name != null ? this.name.hashCode() : 0) * 31) + (this.pinyin != null ? this.pinyin.hashCode() : 0);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("OfflineItem{");
        stringBuffer.append("name='");
        stringBuffer.append(this.name);
        stringBuffer.append('\'');
        stringBuffer.append(", pinyin='");
        stringBuffer.append(this.pinyin);
        stringBuffer.append('\'');
        stringBuffer.append(", size=");
        stringBuffer.append(this.size);
        stringBuffer.append(", upgrade=");
        stringBuffer.append(this.upgrade);
        stringBuffer.append(", percentage=");
        stringBuffer.append(this.percentage);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
