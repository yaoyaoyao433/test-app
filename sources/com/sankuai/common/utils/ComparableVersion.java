package com.sankuai.common.utils;

import com.meituan.android.recce.props.gens.Editable;
import com.meituan.android.recce.props.gens.KeyboardType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.xm.im.message.bean.MsgAddition;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;
import java.util.Properties;
import java.util.Stack;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ComparableVersion implements Comparable<ComparableVersion> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String canonical;
    private ListItem items;
    private String value;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public interface Item {
        public static final int INTEGER_ITEM = 0;
        public static final int LIST_ITEM = 2;
        public static final int STRING_ITEM = 1;

        int compareTo(Item item);

        int getType();

        boolean isNull();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class IntegerItem implements Item {
        private static final BigInteger BIG_INTEGER_ZERO = new BigInteger("0");
        public static final IntegerItem ZERO = new IntegerItem();
        public static ChangeQuickRedirect changeQuickRedirect;
        private final BigInteger value;

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int getType() {
            return 0;
        }

        public IntegerItem() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd113b192d4e747c1099cc61d7aa1849", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd113b192d4e747c1099cc61d7aa1849");
            } else {
                this.value = BIG_INTEGER_ZERO;
            }
        }

        public IntegerItem(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2413a54c95e6f44d581f25bf76af8b79", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2413a54c95e6f44d581f25bf76af8b79");
            } else {
                this.value = new BigInteger(str);
            }
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public boolean isNull() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc1ff2ac0926fbad9523598c91271842", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc1ff2ac0926fbad9523598c91271842")).booleanValue() : BIG_INTEGER_ZERO.equals(this.value);
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int compareTo(Item item) {
            Object[] objArr = {item};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d232bd13e3bdc813a2ba99df88e0b466", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d232bd13e3bdc813a2ba99df88e0b466")).intValue();
            }
            if (item == null) {
                return BIG_INTEGER_ZERO.equals(this.value) ? 0 : 1;
            }
            switch (item.getType()) {
                case 0:
                    return this.value.compareTo(((IntegerItem) item).value);
                case 1:
                    return 1;
                case 2:
                    return 1;
                default:
                    throw new RuntimeException("invalid item: " + item.getClass());
            }
        }

        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f70d7c566ebbbf40dfd13245408f8732", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f70d7c566ebbbf40dfd13245408f8732") : this.value.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class StringItem implements Item {
        private static final Properties ALIASES;
        private static final String[] QUALIFIERS;
        private static final String RELEASE_VERSION_INDEX;
        private static final List<String> _QUALIFIERS;
        public static ChangeQuickRedirect changeQuickRedirect;
        private String value;

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int getType() {
            return 1;
        }

        static {
            String[] strArr = {"alpha", "beta", "milestone", "rc", "snapshot", "", "sp"};
            QUALIFIERS = strArr;
            _QUALIFIERS = Arrays.asList(strArr);
            Properties properties = new Properties();
            ALIASES = properties;
            properties.put("ga", "");
            ALIASES.put(MsgAddition.FINAL, "");
            ALIASES.put("cr", "rc");
            RELEASE_VERSION_INDEX = String.valueOf(_QUALIFIERS.indexOf(""));
        }

        public StringItem(String str, boolean z) {
            Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb3ee35bd18fff3be0429ecaa8e8e52", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb3ee35bd18fff3be0429ecaa8e8e52");
                return;
            }
            if (z && str.length() == 1) {
                char charAt = str.charAt(0);
                if (charAt != 'm') {
                    switch (charAt) {
                        case Editable.INDEX_ID /* 97 */:
                            str = "alpha";
                            break;
                        case KeyboardType.INDEX_ID /* 98 */:
                            str = "beta";
                            break;
                    }
                } else {
                    str = "milestone";
                }
            }
            this.value = ALIASES.getProperty(str, str);
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public boolean isNull() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "666377ca9e81d26f78840ff469171822", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "666377ca9e81d26f78840ff469171822")).booleanValue() : comparableQualifier(this.value).compareTo(RELEASE_VERSION_INDEX) == 0;
        }

        public static String comparableQualifier(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "aae2c92c40359a3e0b31aaf5d3f4f92d", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "aae2c92c40359a3e0b31aaf5d3f4f92d");
            }
            int indexOf = _QUALIFIERS.indexOf(str);
            if (indexOf == -1) {
                return _QUALIFIERS.size() + CommonConstant.Symbol.MINUS + str;
            }
            return String.valueOf(indexOf);
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int compareTo(Item item) {
            Object[] objArr = {item};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e29bc0f3d08098a175c085ca38595382", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e29bc0f3d08098a175c085ca38595382")).intValue();
            }
            if (item == null) {
                return comparableQualifier(this.value).compareTo(RELEASE_VERSION_INDEX);
            }
            switch (item.getType()) {
                case 0:
                    return -1;
                case 1:
                    return comparableQualifier(this.value).compareTo(comparableQualifier(((StringItem) item).value));
                case 2:
                    return -1;
                default:
                    throw new RuntimeException("invalid item: " + item.getClass());
            }
        }

        public String toString() {
            return this.value;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class ListItem extends ArrayList<Item> implements Item {
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int getType() {
            return 2;
        }

        public ListItem() {
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public boolean isNull() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a2fc86982f7cb7c27e5649dbdec7a709", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a2fc86982f7cb7c27e5649dbdec7a709")).booleanValue() : size() == 0;
        }

        public void normalize() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "235e56cb696e74051d9afaaadfad4528", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "235e56cb696e74051d9afaaadfad4528");
                return;
            }
            ListIterator<Item> listIterator = listIterator(size());
            while (listIterator.hasPrevious() && listIterator.previous().isNull()) {
                listIterator.remove();
            }
        }

        @Override // com.sankuai.common.utils.ComparableVersion.Item
        public int compareTo(Item item) {
            int compareTo;
            Object[] objArr = {item};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0dd2c9bc4953c684ff940f34fb673aae", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0dd2c9bc4953c684ff940f34fb673aae")).intValue();
            }
            if (item == null) {
                if (size() == 0) {
                    return 0;
                }
                return get(0).compareTo(null);
            }
            switch (item.getType()) {
                case 0:
                    return -1;
                case 1:
                    return 1;
                case 2:
                    Iterator<Item> it = iterator();
                    Iterator<Item> it2 = ((ListItem) item).iterator();
                    do {
                        if (it.hasNext() || it2.hasNext()) {
                            Item next = it.hasNext() ? it.next() : null;
                            Item next2 = it2.hasNext() ? it2.next() : null;
                            if (next != null) {
                                compareTo = next.compareTo(next2);
                                continue;
                            } else if (next2 == null) {
                                compareTo = 0;
                                continue;
                            } else {
                                compareTo = next2.compareTo(next) * (-1);
                                continue;
                            }
                        } else {
                            return 0;
                        }
                    } while (compareTo == 0);
                    return compareTo;
                default:
                    throw new RuntimeException("invalid item: " + item.getClass());
            }
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "23b18f823de87612ea831a9cfc129bdc", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "23b18f823de87612ea831a9cfc129bdc");
            }
            StringBuilder sb = new StringBuilder(CommonConstant.Symbol.BRACKET_LEFT);
            Iterator<Item> it = iterator();
            while (it.hasNext()) {
                sb.append(it.next());
                if (it.hasNext()) {
                    sb.append(',');
                }
            }
            sb.append(')');
            return sb.toString();
        }
    }

    public ComparableVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fe0741ad2e7c4c7fd01930151816378c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fe0741ad2e7c4c7fd01930151816378c");
        } else {
            parseVersion(str);
        }
    }

    public final void parseVersion(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "720a764e48d545ff3267c9134080b97e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "720a764e48d545ff3267c9134080b97e");
            return;
        }
        this.value = str;
        this.items = new ListItem();
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        ListItem listItem = this.items;
        Stack stack = new Stack();
        stack.push(listItem);
        ListItem listItem2 = listItem;
        int i = 0;
        boolean z = false;
        for (int i2 = 0; i2 < lowerCase.length(); i2++) {
            char charAt = lowerCase.charAt(i2);
            if (charAt == '.') {
                if (i2 == i) {
                    listItem2.add(IntegerItem.ZERO);
                } else {
                    listItem2.add(parseItem(z, lowerCase.substring(i, i2)));
                }
                i = i2 + 1;
            } else if (charAt == '-') {
                if (i2 == i) {
                    listItem2.add(IntegerItem.ZERO);
                } else {
                    listItem2.add(parseItem(z, lowerCase.substring(i, i2)));
                }
                i = i2 + 1;
                if (z) {
                    listItem2.normalize();
                    if (i < lowerCase.length() && Character.isDigit(lowerCase.charAt(i))) {
                        ListItem listItem3 = new ListItem();
                        listItem2.add(listItem3);
                        stack.push(listItem3);
                        listItem2 = listItem3;
                    }
                }
            } else if (Character.isDigit(charAt)) {
                if (!z && i2 > i) {
                    listItem2.add(new StringItem(lowerCase.substring(i, i2), true));
                    i = i2;
                }
                z = true;
            } else {
                if (z && i2 > i) {
                    listItem2.add(parseItem(true, lowerCase.substring(i, i2)));
                    i = i2;
                }
                z = false;
            }
        }
        if (lowerCase.length() > i) {
            listItem2.add(parseItem(z, lowerCase.substring(i)));
        }
        while (!stack.isEmpty()) {
            ((ListItem) stack.pop()).normalize();
        }
        this.canonical = this.items.toString();
    }

    private static Item parseItem(boolean z, String str) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f4e4d4184b22b6586de6395b35cb7f05", RobustBitConfig.DEFAULT_VALUE) ? (Item) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f4e4d4184b22b6586de6395b35cb7f05") : z ? new IntegerItem(str) : new StringItem(str, false);
    }

    @Override // java.lang.Comparable
    public int compareTo(ComparableVersion comparableVersion) {
        Object[] objArr = {comparableVersion};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b4c7f4d4bcf871441b01f2096f976e57", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b4c7f4d4bcf871441b01f2096f976e57")).intValue() : this.items.compareTo(comparableVersion.items);
    }

    public String toString() {
        return this.value;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abc8cd1621f502954e53a69aa5cd5007", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abc8cd1621f502954e53a69aa5cd5007")).booleanValue() : (obj instanceof ComparableVersion) && this.canonical.equals(((ComparableVersion) obj).canonical);
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5abbc289a767cad826cfe48b5473f498", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5abbc289a767cad826cfe48b5473f498")).intValue() : this.canonical.hashCode();
    }
}
