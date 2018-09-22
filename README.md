# CriminalIntent

《Android 编程权威指南》一书中最为复杂的应用。书中第 7 ~ 19 章内容均围绕此应用展开。

## 涉及技术

- （第 7 章）fragment 的引入（原生版本 和 支持库版本）；推荐使用 android.support.v4.app.Fragment 支持库版本；FragmentManager（fragment 事务回退栈）
- （第 8 章）单例存数据；RecyclerView、ViewHolder 和 Adapter；内部类
- （第 9 章）ConstraintLayout；dp（无论屏幕密度如何，总能获得同样的尺寸）；sp（一般用于设置屏幕上字体大小）
- （第 10 章）fragment argument 每个 fragment 实例都可附带一个 Bundle 对象。该 bundle 包含键-值对，我们可以像附加 extra 到 Activity 的 intent 中那样使用它们。一个键-值对即一个 argument。
- （第 11 章）ViewPager 与 PagerAdapter；FragmentStatePagerAdapter 与 FragmentPagerAdapter 的区别（FragmentPagerAdapter 创建的 fragment 永远不会被销毁）
- （第 12 章）AlertDialog；使用 DialogFragment 对 AlertDialog 进行封装；fragment 间数据传递（Bundle 与 startActivityForResult(...) 的巧妙结合）