    import android.view.LayoutInflater
    import android.view.ViewGroup
    import androidx.recyclerview.widget.ListAdapter
    import androidx.recyclerview.widget.RecyclerView
    import com.example.project6.Note
    import com.example.project6.NoteDiffItemCallback
    import com.example.project6.databinding.FragmentNotesBinding
    import com.example.project6.databinding.RvLayoutBinding
    import kotlin.reflect.KFunction1

    class NotesAdapter(
        val clickListener: KFunction1<FragmentNotesBinding, Unit>,
        val deleteClickListener: (noteId: Long) -> Unit)
        : ListAdapter<Note, NotesAdapter.NoteItemViewHolder>(NoteDiffItemCallback()) {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int)
                : NoteItemViewHolder = NoteItemViewHolder.inflateFrom(parent)
        override fun onBindViewHolder(holder: NoteItemViewHolder, position: Int) {
            val item = getItem(position)
            holder.bind(item, item.noteId, deleteClickListener)
        }

        class NoteItemViewHolder(val binding: RvLayoutBinding)
            : RecyclerView.ViewHolder(binding.root) {

            companion object {
                fun inflateFrom(parent: ViewGroup): NoteItemViewHolder {
                    val layoutInflater = LayoutInflater.from(parent.context)
                    val binding = RvLayoutBinding.inflate(layoutInflater, parent, false)
                    return NoteItemViewHolder(binding)
                }
            }

            fun bind(
                item: Note, clickListener: Long,
                deleteClickListener: (noteId: Long) -> Unit) {
                binding.note = item
                binding.root.setOnClickListener { item.noteId?.let { it1 -> (it1) } }
                binding.xButton.setOnClickListener{ item.noteId?.let { it1 ->
                    deleteClickListener(
                        it1
                    )
                } }
            }
        }
    }