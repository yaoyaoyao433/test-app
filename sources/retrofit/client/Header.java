package retrofit.client;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class Header {
    private final String name;
    private final String value;

    public Header(String str, String str2) {
        this.name = str;
        this.value = str2;
    }

    public final String getName() {
        return this.name;
    }

    public final String getValue() {
        return this.value;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Header header = (Header) obj;
        if (this.name == null ? header.name == null : this.name.equals(header.name)) {
            return this.value == null ? header.value == null : this.value.equals(header.value);
        }
        return false;
    }

    public final int hashCode() {
        return ((this.name != null ? this.name.hashCode() : 0) * 31) + (this.value != null ? this.value.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.name != null ? this.name : "");
        sb.append(": ");
        sb.append(this.value != null ? this.value : "");
        return sb.toString();
    }
}
