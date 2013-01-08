if ARGV.size < 2
	$stderr.puts "Please enter two parameters: \n	num of results to return\n	num of rows/columns"
	exit
end

numToReturn = ARGV[0].to_i
gridSize = ARGV[1].to_i
gridEntries = gridSize * gridSize

r = Random.new
print "#{numToReturn} #{gridSize}"

for i in 1..gridEntries
	print " #{r.rand(1..5)}"
end







