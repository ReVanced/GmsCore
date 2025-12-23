## 2024-09-24 - [Android SQLite Performance]
**Learning:** `getColumnIndexOrThrow` inside a loop is a significant performance bottleneck in Android due to repeated string comparisons.
**Action:** Always hoist column index resolution outside the cursor iteration loop. Use a helper class or local variables to store indices.
