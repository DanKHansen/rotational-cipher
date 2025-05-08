object RotationalCipher:
   def rotate(s: String, i: Int): String =
      def switch(c: Char) = if c.isLower then 'a' else 'A'
      s.map(c => if !c.isLetter then c else ((c - switch(c) + i) % 26 + switch(c)).toChar)