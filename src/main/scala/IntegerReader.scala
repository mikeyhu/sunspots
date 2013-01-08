import java.io.InputStreamReader
import java.io.InputStream
import java.io.FileInputStream
import java.io.StreamTokenizer

class IntegerReader(st : StreamTokenizer) extends Stream[Int] {

	val hasNext = st.nextToken()
	val token = st.nval

	override def head = token.toInt

	override def tail = new IntegerReader(st)

	override def tailDefined = !isEmpty

	override def isEmpty = hasNext == StreamTokenizer.TT_EOF
}

object IntegerReader {
	def apply(filename:String) = new IntegerReader(new StreamTokenizer(new InputStreamReader(new FileInputStream(filename))))
}
